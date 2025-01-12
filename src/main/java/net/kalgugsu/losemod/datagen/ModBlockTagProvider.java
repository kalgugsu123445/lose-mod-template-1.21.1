package net.kalgugsu.losemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.kalgugsu.losemod.block.ModBlocks;
import net.kalgugsu.losemod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ADJ_HG)
                .add(ModBlocks.CY_HG)
                .add(ModBlocks.ORE_HG)
                .add(ModBlocks.SLD_HG)
                .add(ModBlocks.CUTTING_BOARD);



        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ADJ_HG)
                .add(ModBlocks.CY_HG)
                .add(ModBlocks.ORE_HG);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SLD_HG);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_HG_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
    }
}