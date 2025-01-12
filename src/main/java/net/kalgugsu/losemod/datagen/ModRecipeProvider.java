package net.kalgugsu.losemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kalgugsu.losemod.block.ModBlocks;
import net.kalgugsu.losemod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> GEM_HG_SMELTABLES = List.of(ModItems.FAR_HG, ModBlocks.ORE_HG,
                ModBlocks.SLD_HG);

        offerSmelting(exporter, GEM_HG_SMELTABLES, RecipeCategory.MISC, ModItems.GEM_HG, 0.35f, 350, "gem_hg");
        offerBlasting(exporter, GEM_HG_SMELTABLES, RecipeCategory.MISC, ModItems.GEM_HG, 0.55f, 250, "gem_hg");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CY_HG)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.FAR_HG)
                .criterion(hasItem(ModItems.FAR_HG), conditionsFromItem(ModItems.FAR_HG))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FAR_HG, 9)
                .input(ModBlocks.CY_HG)
                .criterion(hasItem(ModBlocks.CY_HG), conditionsFromItem(ModBlocks.CY_HG))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADJ_HG)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.GEM_HG)
                .criterion(hasItem(ModItems.GEM_HG), conditionsFromItem(ModItems.GEM_HG))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GEM_HG, 9)
                .input(ModBlocks.ADJ_HG)
                .criterion(hasItem(ModBlocks.ADJ_HG), conditionsFromItem(ModBlocks.ADJ_HG))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HG_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('R', ModItems.GEM_HG)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HG_SWORD), conditionsFromItem(ModItems.HG_SWORD))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HG_PICKAXE)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.GEM_HG)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HG_PICKAXE), conditionsFromItem(ModItems.HG_PICKAXE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HG_AXE)
                .pattern("RR ")
                .pattern("RS ")
                .pattern(" S ")
                .input('R', ModItems.GEM_HG)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HG_AXE), conditionsFromItem(ModItems.HG_AXE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HG_SHOVEL)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.GEM_HG)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HG_SHOVEL), conditionsFromItem(ModItems.HG_SHOVEL))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HG_HOE)
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.GEM_HG)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.HG_HOE), conditionsFromItem(ModItems.HG_HOE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HOTGU)
                .pattern("FFF")
                .pattern("FCF")
                .pattern("CCC")
                .input('F', ModItems.FAR_HG)
                .input('C', Items.COAL)
                .criterion(hasItem(ModItems.HOTGU), conditionsFromItem(ModItems.HOTGU))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HGFOOD_SEEDS)
                .pattern("CCC")
                .pattern("SFS")
                .pattern("CCC")
                .input('F', ModItems.HOTGU)
                .input('C', Items.WHEAT_SEEDS)
                .input('S', Items.SPIDER_EYE)
                .criterion(hasItem(ModItems.HGFOOD_SEEDS), conditionsFromItem(ModItems.HGFOOD_SEEDS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HG_HELMET)
                .pattern("FFF")
                .pattern("FCF")
                .pattern("SSS")
                .input('F', ModBlocks.ADJ_HG)
                .input('C', Items.IRON_HELMET)
                .input('S', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.HG_HELMET), conditionsFromItem(ModItems.HG_HELMET))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HG_CHESTPLATE)
                .pattern("F F")
                .pattern("FCF")
                .pattern("FFF")
                .input('F', ModItems.GEM_HG)
                .input('C', Items.IRON_CHESTPLATE)
                .criterion(hasItem(ModItems.HG_CHESTPLATE), conditionsFromItem(ModItems.HG_CHESTPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HG_LEGGINGS)
                .pattern("FFF")
                .pattern("FCF")
                .pattern("F F")
                .input('F', ModItems.GEM_HG)
                .input('C', Items.IRON_LEGGINGS)
                .criterion(hasItem(ModItems.HG_LEGGINGS), conditionsFromItem(ModItems.HG_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HG_BOOTS)
                .pattern("   ")
                .pattern("F F")
                .pattern("FCF")
                .input('F', ModItems.GEM_HG)
                .input('C', Items.IRON_BOOTS)
                .criterion(hasItem(ModItems.HG_BOOTS), conditionsFromItem(ModItems.HG_BOOTS))
                .offerTo(exporter);
    }

}


