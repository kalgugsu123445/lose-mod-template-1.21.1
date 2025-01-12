package net.kalgugsu.losemod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.kalgugsu.losemod.block.ModBlocks;
import net.kalgugsu.losemod.enchantment.ModEnchantmentEffects;
import net.kalgugsu.losemod.entity.ModBlockEntities;
import net.kalgugsu.losemod.item.ItemGroups;
import net.kalgugsu.losemod.item.ModItems;
import net.kalgugsu.losemod.screen.ModScreenHandlers;
import net.kalgugsu.losemod.world.gen.ModWorldGeneration;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoseMod implements ModInitializer {
	public static final String MOD_ID = "losemod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ItemGroups.registerItemGroups();

		ModEnchantmentEffects.registerEnchantmentEffects();

		ModWorldGeneration.generateModWorldGen();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();



		LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
			if (key.getValue().equals(Identifier.of("minecraft", "gameplay/fishing")) && source == LootTableSource.VANILLA) {
				LootPool pool = LootPool.builder()
						.with(ItemEntry.builder(ModItems.OCTOPUS))
						.with(ItemEntry.builder(ModItems.SHRIMP))
						// 문어 아이템 추가
						.conditionally(RandomChanceLootCondition.builder(0.2f).build())
						.build();

				tableBuilder.pool(pool);
			}
		});




		FuelRegistry.INSTANCE.add(ModItems.HOTGU, 1100);

		CompostingChanceRegistry.INSTANCE.add(ModItems.HGFOOD, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HGFOOD_SEEDS, 0.25f);
	}
}