package net.kalgugsu.losemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.kalgugsu.losemod.block.ModBlocks;
import net.kalgugsu.losemod.block.custom.HgfoodCropBlock;
import net.kalgugsu.losemod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

        @Override
        public void generate() {
            addDrop(ModBlocks.ORE_HG);
            addDrop(ModBlocks.SLD_HG);
            addDrop(ModBlocks.CY_HG);
            addDrop(ModBlocks.ADJ_HG);

            addDrop(ModBlocks.ORE_HG, oreDrops(ModBlocks.ORE_HG, ModItems.FAR_HG));
            addDrop(ModBlocks.SLD_HG, oreDrops(ModBlocks.SLD_HG, ModItems.FAR_HG));
            addDrop(ModBlocks.ADJ_HG, oreDrops(ModBlocks.ADJ_HG, ModItems.ADG_HG));
            addDrop(ModBlocks.CUTTING_BOARD, oreDrops(ModBlocks.CUTTING_BOARD, ModItems.CUTTING_BOARD));
            addDrop(ModBlocks.CY_HG, multipleOreDrops(ModBlocks.CY_HG, ModItems.FAR_HG, 4, 4));
            addDrop(ModBlocks.SLD_HG, multipleOreDrops(ModBlocks.SLD_HG, ModItems.FAR_HG, 1, 4));
            addDrop(ModBlocks.ORE_HG, multipleOreDrops(ModBlocks.ORE_HG, ModItems.FAR_HG, 1, 3));




            BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.HGFOOD_CROP)
                    .properties(StatePredicate.Builder.create().exactMatch(HgfoodCropBlock.AGE, HgfoodCropBlock.MAX_AGE));
            this.addDrop(ModBlocks.HGFOOD_CROP, this.cropDrops(ModBlocks.HGFOOD_CROP, ModItems.HGFOOD, ModItems.HGFOOD_SEEDS, builder2));
        }


    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}