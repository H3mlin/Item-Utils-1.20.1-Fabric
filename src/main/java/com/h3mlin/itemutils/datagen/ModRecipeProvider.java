package com.h3mlin.itemutils.datagen;

import com.h3mlin.itemutils.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.recipe.book.RecipeCategory;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    /*private static final List<ItemConvertible> SOME_SMELTABLE = List.of(
            ModItems.ITEM_NAME
    );*/

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ITEM_EXTRACTOR)
                .pattern("GRG")
                .pattern("RHR")
                .pattern("GRG")
                .input('R', Items.REDSTONE)
                .input('G', Items.GOLD_INGOT)
                .input('H', Items.HOPPER)
                .criterion("has_computer", InventoryChangedCriterion.Conditions.items(ItemPredicate.Builder.create().items(
                        Registries.ITEM.get(new Identifier("computercraft", "computer_normal")),
                        Registries.ITEM.get(new Identifier("computercraft", "computer_advanced"))
                ).build()))
                .offerTo(exporter);

        //offerSmelting(exporter, SMELTABLE, RecipeCategory.MISC, ModItems.ITEM_NAME, 0.7F, 200, "item");
        //offerBlasting(exporter, SMELTABLE, RecipeCategory.MISC, ModItems.ITEM_NAME, 0.7F, 200, "item");

        //And so on
    }
}
