package net.kalgugsu.losemod.enchantment;

import com.mojang.serialization.MapCodec;
import net.kalgugsu.losemod.LoseMod;
import net.kalgugsu.losemod.enchantment.custom.HealingEnchantmentEffect;
import net.kalgugsu.losemod.enchantment.custom.LightningStrikerEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEnchantmentEffects {
    public static final MapCodec<? extends EnchantmentEntityEffect> LIGHTNING_STRIKER =
            registerEntityEffect("lightning_striker", LightningStrikerEnchantmentEffect.CODEC);

    public static final MapCodec<? extends EnchantmentEntityEffect> HEALING =
            registerEntityEffect("healing", HealingEnchantmentEffect.CODEC);


    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name, MapCodec<? extends EnchantmentEntityEffect> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(LoseMod.MOD_ID, name), codec);

    }

    public static void registerEnchantmentEffects() {
        LoseMod.LOGGER.info("Registering Mod Enchantment Effects for " + LoseMod.MOD_ID);
    }

}
