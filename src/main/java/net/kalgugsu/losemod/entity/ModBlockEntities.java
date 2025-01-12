package net.kalgugsu.losemod.entity;

import net.kalgugsu.losemod.LoseMod;
import net.kalgugsu.losemod.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<CuttingBoardBlockEntity> CUTTONG_BOARD_BLOCK_ENTITY_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(LoseMod.MOD_ID, "cuttibg_board_be"),
                    BlockEntityType.Builder.create(CuttingBoardBlockEntity::new, ModBlocks.CUTTING_BOARD).build(null));

    public static void registerBlockEntities() {
        LoseMod.LOGGER.info("Registering Block Entities for " + LoseMod.MOD_ID);
    }
}
