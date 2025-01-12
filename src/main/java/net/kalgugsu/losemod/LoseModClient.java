package net.kalgugsu.losemod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.kalgugsu.losemod.block.ModBlocks;
import net.kalgugsu.losemod.screen.CuttingBoardScreen;
import net.kalgugsu.losemod.screen.ModScreenHandlers;
import net.kalgugsu.losemod.util.ModModelPredicates;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class LoseModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HGFOOD_CROP, RenderLayer.getCutout());


        HandledScreens.register(ModScreenHandlers.CUTTING_BOARD_SCREEN_HANDLER, CuttingBoardScreen::new);


        ModModelPredicates.registerModelPredicates();

    }
}

