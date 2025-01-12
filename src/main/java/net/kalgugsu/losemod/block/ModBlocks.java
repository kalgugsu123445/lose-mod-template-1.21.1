package net.kalgugsu.losemod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kalgugsu.losemod.LoseMod;
import net.kalgugsu.losemod.block.custom.HgfoodCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ORE_HG = registerBlock("ore_hg",
            new Block(AbstractBlock.Settings.create().strength(3f, 4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SLD_HG = registerBlock("sld_hg",
            new Block(AbstractBlock.Settings.create().strength(4f, 5f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ADJ_HG = registerBlock("adj_hg",
            new Block(AbstractBlock.Settings.create().strength(3f, 4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CY_HG = registerBlock("cy_hg",
            new Block(AbstractBlock.Settings.create().strength(3f, 4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CUTTING_BOARD = registerBlock("cutting_board",
            new CuttingBoardBlock(AbstractBlock.Settings.create().strength(2f, 2f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block HGFOOD_CROP = registerBlockWithoutBlockItem("hgfood_crop",
            new HgfoodCropBlock(AbstractBlock.Settings.create().noCollision()
                    .ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY).mapColor(MapColor.DARK_GREEN)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(LoseMod.MOD_ID, name), block);
    }


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LoseMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LoseMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LoseMod.LOGGER.info("Registering Mod Blocks for " + LoseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.ORE_HG);
            entries.add(ModBlocks.SLD_HG);
            entries.add(ModBlocks.CY_HG);
            entries.add(ModBlocks.ADJ_HG);
        });
    }

}
