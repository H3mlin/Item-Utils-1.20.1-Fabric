package com.h3mlin.itemutils.block.enity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ItemExtractorEntity extends BlockEntity {
    public ItemExtractorEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ITEM_EXTRACTOR_ENTITY, pos, state);
    }
}
