package net.kalgugsu.losemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.kalgugsu.losemod.item.ModItems;
import net.kalgugsu.losemod.util.ModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;


import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORHG_ITEMS)
                .add(ModItems.GEM_HG)
                .add(ModItems.FAR_HG)
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.APPLE);


        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.HG_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.HG_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.HG_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.HG_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.HG_HOE);


        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.HG_HELMET)
                .add(ModItems.HG_CHESTPLATE)
                .add(ModItems.HG_LEGGINGS)
                .add(ModItems.HG_BOOTS);
    }
}