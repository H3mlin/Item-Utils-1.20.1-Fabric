package com.h3mlin.itemutils.block.enity;

import com.h3mlin.itemutils.CCItemUtils;
import com.h3mlin.itemutils.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<ItemExtractorEntity> ITEM_EXTRACTOR_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(CCItemUtils.MOD_ID, "item_extractor_entity"),
                    BlockEntityType.Builder.create(ItemExtractorEntity::new, ModBlocks.ITEM_EXTRACTOR).build(null));

    public static void registerBlockEntities() {
        CCItemUtils.LOGGER.info(CCItemUtils.MOD_ID + ": Registering block entities");
    }
}
