package com.h3mlin.itemutils.datagen;

import com.h3mlin.itemutils.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ITEM_EXTRACTOR);

        //addDrop(ModBlocks.BLOCK_NAME);
        //addDrop(ModBlocks.BLOCK_NAME, oreDrops(ModBlocks.BLOCK_NAME, ModItems.ITEM_NAME));
        //addDrop(ModBlocks.BLOCK_NAME, multiDrops(ModBlocks.BLOCK_NAME, ModBlocks.ITEM_NAME, 1F, 3F));
    }

    public LootTable.Builder multiDrops(Block drop, Item item, float min, float max) {
        return dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
