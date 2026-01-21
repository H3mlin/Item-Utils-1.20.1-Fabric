package com.h3mlin.itemutils.block.peripheral;

import com.h3mlin.itemutils.block.enity.ItemExtractorEntity;
import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.peripheral.IPeripheral;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageUtil;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

public class ItemExtractorPeripheral implements IPeripheral {
    private final ItemExtractorEntity blockEntity;

    public ItemExtractorPeripheral(ItemExtractorEntity entity) {
        this.blockEntity = entity;
    }

    public @NotNull String getType() {
        return "itemExtractor";
    }

    public boolean equals(@Nullable IPeripheral other) {
        return false;
    }

    @LuaFunction(mainThread = true)
    public final long extract(String itemId, long itemCount) {
        if (this.blockEntity.getWorld() == null || this.blockEntity.getWorld().isClient) return 0;

        Identifier id = new Identifier(itemId);
        Item item = Registries.ITEM.get(id);
        if (id.equals(Registries.ITEM.getDefaultId())) return 0;

        ItemVariant variant = ItemVariant.of(item);

        Storage<ItemVariant> source = ItemStorage.SIDED.find(this.blockEntity.getWorld(), this.blockEntity.getPos().up(), Direction.UP);
        Storage<ItemVariant> target = ItemStorage.SIDED.find(this.blockEntity.getWorld(), this.blockEntity.getPos().down(), Direction.DOWN);

        if (source == null || target == null) return 0;

        try (Transaction transaction = Transaction.openOuter()) {
            long moved = StorageUtil.move(source, target, v -> v.equals(variant), itemCount, transaction);
            transaction.commit();
            return moved;
        }
    }
}
