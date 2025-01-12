package net.kalgugsu.losemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kalgugsu.losemod.block.ModBlocks;
import net.kalgugsu.losemod.block.custom.HgfoodCropBlock;
import net.kalgugsu.losemod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADJ_HG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CY_HG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLD_HG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORE_HG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUTTING_BOARD);

        blockStateModelGenerator.registerCrop(ModBlocks.HGFOOD_CROP, HgfoodCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.GEM_HG, Models.GENERATED);
        itemModelGenerator.register(ModItems.FAR_HG, Models.GENERATED);

        itemModelGenerator.register(ModItems.HGFOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OCTOPUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GINSENG, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHESTNUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNIVERSAL_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_PEPPER_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALTED_SHRIMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINCED_GARLIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.FISH_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOY_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLUM_EXTRACT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAY_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONION, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRING_ONION, Models.GENERATED);
        itemModelGenerator.register(ModItems.NAPA_CABBAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHRIMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARLIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUJUBE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLUTINOUS_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GINGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEAN, Models.GENERATED);



        itemModelGenerator.register(ModItems.HOTGU, Models.GENERATED);


        itemModelGenerator.register(ModItems.HG_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HG_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HG_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HG_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.HG_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HG_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HG_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HG_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HG_BOOTS));
    }
}
