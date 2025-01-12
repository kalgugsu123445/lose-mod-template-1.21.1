package net.kalgugsu.losemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kalgugsu.losemod.LoseMod;
import net.kalgugsu.losemod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup HG_ITEM_GROUPS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LoseMod.MOD_ID, "gem_hg"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GEM_HG))
                    .displayName(Text.translatable("itemgroup.losemod.hg_item"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GEM_HG);
                        entries.add(ModItems.FAR_HG);

                        entries.add(ModItems.HGFOOD);
                        entries.add(ModItems.RICE);
                        entries.add(ModItems.CHESTNUT);
                        entries.add(ModItems.GINSENG);
                        entries.add(ModItems.OCTOPUS);
                        entries.add(ModItems.FLOUR);
                        entries.add(ModItems.UNIVERSAL_SAUCE);
                        entries.add(ModItems.OIL);
                        entries.add(ModItems.CHUNJANG);
                        entries.add(ModItems.RED_PEPPER_POWDER);
                        entries.add(ModItems.SALTED_SHRIMP);
                        entries.add(ModItems.MINCED_GARLIC);
                        entries.add(ModItems.SALT);
                        entries.add(ModItems.RADISH);
                        entries.add(ModItems.FISH_SAUCE);
                        entries.add(ModItems.SOY_SAUCE);
                        entries.add(ModItems.PLUM);
                        entries.add(ModItems.PLUM_EXTRACT);
                        entries.add(ModItems.BAY_LEAF);
                        entries.add(ModItems.COOKED_RICE);
                        entries.add(ModItems.ONION);
                        entries.add(ModItems.SPRING_ONION);
                        entries.add(ModItems.NAPA_CABBAGE);
                        entries.add(ModItems.SHRIMP);
                        entries.add(ModItems.GARLIC);
                        entries.add(ModItems.JUJUBE);
                        entries.add(ModItems.GLUTINOUS_RICE);
                        entries.add(ModItems.GINGER);
                        entries.add(ModItems.BEAN);



                        entries.add(ModItems.HOTGU);

                        entries.add(ModItems.HGFOOD_SEEDS);
                    }).build());

    public static final ItemGroup HG_BLOCK_GROUPS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LoseMod.MOD_ID, "adj_hg"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ADJ_HG))
                    .displayName(Text.translatable("itemgroup.losemod.hg_block"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ADJ_HG);
                        entries.add(ModBlocks.SLD_HG);
                        entries.add(ModBlocks.CY_HG);
                        entries.add(ModBlocks.ORE_HG);
                        entries.add(ModBlocks.CUTTING_BOARD);
                    }).build());


    public static final ItemGroup HG_WEAPON_GROUPS= Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LoseMod.MOD_ID, "hg_sword"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HG_SWORD))
                    .displayName(Text.translatable("itemgroup.losemod.hg_weapon"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HG_SWORD);
                        entries.add(ModItems.HG_PICKAXE);
                        entries.add(ModItems.HG_AXE);
                        entries.add(ModItems.HG_SHOVEL);
                        entries.add(ModItems.HG_HOE);

                        entries.add(ModItems.HG_HELMET);
                        entries.add(ModItems.HG_CHESTPLATE);
                        entries.add(ModItems.HG_LEGGINGS);
                        entries.add(ModItems.HG_BOOTS);
                    }).build());


    public static void registerItemGroups() {
        LoseMod.LOGGER.info("Registering Item Groups for " + LoseMod.MOD_ID);
    }
}
