package com.h3mlin.itemutils.datagen;

import com.h3mlin.itemutils.CCItemUtils;
import com.h3mlin.itemutils.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier sideTex = new Identifier(CCItemUtils.MOD_ID, "block/item_extractor");
        Identifier endTex = new Identifier(CCItemUtils.MOD_ID, "block/item_extractor_top");

        TextureMap textures = new TextureMap()
                .put(TextureKey.END, endTex)
                .put(TextureKey.SIDE, sideTex);

        blockStateModelGenerator.registerSingleton(
                ModBlocks.ITEM_EXTRACTOR,
                textures,
                Models.CUBE_COLUMN
        );

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_NAME);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.ITEM_NAME, Models.GENERATED);
    }
}
