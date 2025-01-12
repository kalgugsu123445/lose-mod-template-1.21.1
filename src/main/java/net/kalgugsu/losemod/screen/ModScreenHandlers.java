package net.kalgugsu.losemod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.kalgugsu.losemod.LoseMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CuttingBoardScreenHandler> CUTTING_BOARD_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(LoseMod.MOD_ID, "cutting_board"),
                    new ExtendedScreenHandlerType<>(CuttingBoardScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerScreenHandlers() {
        LoseMod.LOGGER.info("Registering Screen Handlers for " + LoseMod.MOD_ID);
    }
}
