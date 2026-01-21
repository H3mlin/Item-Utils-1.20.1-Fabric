package com.h3mlin.itemutils.item;

import com.h3mlin.itemutils.CCItemUtils;
import com.h3mlin.itemutils.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CC_ITEM_UTILS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CCItemUtils.MOD_ID, "cc_item_utils"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.LIGHT))
                    .displayName(Text.translatable("itemgroup.itemutils.creativetab"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ITEM_EXTRACTOR);
                    })
                    .build());

    public static void registerItemGroups() {
        CCItemUtils.LOGGER.info(CCItemUtils.MOD_ID + ": Registering item groups");
    }
}
