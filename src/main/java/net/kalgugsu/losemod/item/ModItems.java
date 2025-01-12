package net.kalgugsu.losemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kalgugsu.losemod.LoseMod;
import net.kalgugsu.losemod.block.ModBlocks;
import net.kalgugsu.losemod.item.custom.ModArmorItem;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {
    public static final Item GEM_HG = registerItem("gem_hg", new Item(new Item.Settings()));
    public static final Item FAR_HG = registerItem("far_hg", new Item(new Item.Settings()));
    public static final Item ADG_HG = registerItem("adj_hg", new Item(new Item.Settings()));
    public static final Item CUTTING_BOARD = registerItem("cutting_board", new Item(new Item.Settings()));


    public static final Item HGFOOD = registerItem("hgfood", new Item(new Item.Settings().food(ModFoodComponents.HGFOOD)));
    public static final Item OCTOPUS = registerItem("octopus", new Item(new Item.Settings().food(ModFoodComponents.OCTOPUS)));
    public static final Item GINSENG = registerItem("ginseng", new Item(new Item.Settings().food(ModFoodComponents.GINSENG)));
    public static final Item CHESTNUT = registerItem("chestnut", new Item(new Item.Settings().food(ModFoodComponents.CHESTNUT)));
    public static final Item RICE = registerItem("rice", new Item(new Item.Settings()));
    public static final Item FLOUR = registerItem("flour", new Item(new Item.Settings()));
    public static final Item UNIVERSAL_SAUCE = registerItem("universal_sauce", new Item(new Item.Settings()));
    public static final Item OIL = registerItem("oil", new Item(new Item.Settings()));
    public static final Item CHUNJANG = registerItem("chunjang", new Item(new Item.Settings()));
    public static final Item RED_PEPPER_POWDER = registerItem("red_pepper_powder", new Item(new Item.Settings()));
    public static final Item SALTED_SHRIMP = registerItem("salted_shrimp", new Item(new Item.Settings()));
    public static final Item MINCED_GARLIC = registerItem("minced_garlic", new Item(new Item.Settings()));
    public static final Item SALT = registerItem("salt", new Item(new Item.Settings()));
    public static final Item RADISH = registerItem("radish", new Item(new Item.Settings()));
    public static final Item FISH_SAUCE = registerItem("fish_sauce", new Item(new Item.Settings()));
    public static final Item SOY_SAUCE = registerItem("soy_sauce", new Item(new Item.Settings()));
    public static final Item PLUM = registerItem("plum", new Item(new Item.Settings()));
    public static final Item PLUM_EXTRACT = registerItem("plum_extract", new Item(new Item.Settings()));
    public static final Item BAY_LEAF = registerItem("bay_leaf", new Item(new Item.Settings()));
    public static final Item COOKED_RICE = registerItem("cooked_rice", new Item(new Item.Settings()));
    public static final Item ONION = registerItem("onion", new Item(new Item.Settings()));
    public static final Item SPRING_ONION = registerItem("spring_onion", new Item(new Item.Settings()));
    public static final Item NAPA_CABBAGE = registerItem("napa_cabbage", new Item(new Item.Settings()));
    public static final Item SHRIMP = registerItem("shrimp", new Item(new Item.Settings()));
    public static final Item GARLIC = registerItem("garlic", new Item(new Item.Settings()));
    public static final Item JUJUBE = registerItem("jujube", new Item(new Item.Settings()));
    public static final Item GLUTINOUS_RICE = registerItem("glutinous_rice", new Item(new Item.Settings()));
    public static final Item GINGER = registerItem("ginger", new Item(new Item.Settings()));
    public static final Item BEAN = registerItem("bean", new Item(new Item.Settings()));


    public static final Item HOTGU = registerItem("hotgu", new Item(new Item.Settings()));



    public static final Item HG_SWORD = registerItem("hg_sword",
            new SwordItem(ModToolMaterials.GEM_HG, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GEM_HG, 5, -2.0f))));
    public static final Item HG_PICKAXE = registerItem("hg_pickaxe",
            new PickaxeItem(ModToolMaterials.GEM_HG, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GEM_HG, -1, 96))));
    public static final Item HG_SHOVEL = registerItem("hg_shovel",
            new ShovelItem(ModToolMaterials.GEM_HG, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GEM_HG, -1, 96))));
    public static final Item HG_AXE = registerItem("hg_axe",
            new AxeItem(ModToolMaterials.GEM_HG, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GEM_HG, 19, -4.5f))));
    public static final Item HG_HOE = registerItem("hg_hoe",
            new HoeItem(ModToolMaterials.GEM_HG, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GEM_HG, 1, 6f))));



    public static final Item HGFOOD_SEEDS = registerItem("hgfood_seeds",
            new AliasedBlockItem(ModBlocks.HGFOOD_CROP, new Item.Settings()));



    public static final Item HG_HELMET = registerItem("hg_helmet",
            new ModArmorItem(ModArmorMaterials.HG_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10))));
    public static final Item HG_CHESTPLATE = registerItem("hg_chestplate",
            new ArmorItem(ModArmorMaterials.HG_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(19))));
    public static final Item HG_LEGGINGS = registerItem("hg_leggings",
            new ArmorItem(ModArmorMaterials.HG_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(17))));
    public static final Item HG_BOOTS = registerItem("hg_boots",
            new ArmorItem(ModArmorMaterials.HG_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LoseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LoseMod.LOGGER.info("Registering Mod Items for " + LoseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GEM_HG);
            entries.add(FAR_HG);
        });
    }
}
