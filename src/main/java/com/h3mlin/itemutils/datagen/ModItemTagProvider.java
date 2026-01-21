package com.h3mlin.itemutils.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        /*getOrCreateTagBuilder(Items.ITEM_TAG_NAME)
                .add(Items.ITEM_NAME);*/
        /*getOrCreateTagBuilder(ModTags.Items.ITEM_TAG_NAME)
                .add(ModItems.ITEM_NAME);*/
    }
}
