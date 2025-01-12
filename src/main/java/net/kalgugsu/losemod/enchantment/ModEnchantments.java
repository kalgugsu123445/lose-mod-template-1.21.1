package net.kalgugsu.losemod.enchantment;

import net.kalgugsu.losemod.LoseMod;
import net.kalgugsu.losemod.enchantment.custom.HealingEnchantmentEffect;
import net.kalgugsu.losemod.enchantment.custom.LightningStrikerEnchantmentEffect;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    public static final RegistryKey<Enchantment> LOSE =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(LoseMod.MOD_ID, "lose"));

    public static final RegistryKey<Enchantment> HEALING =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(LoseMod.MOD_ID, "healing"));


    public static void bootstrap(Registerable<Enchantment> registerable) {
            var enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
            var items = registerable.getRegistryLookup(RegistryKeys.ITEM);

            register(registerable, LOSE, Enchantment.builder(Enchantment.definition(
                            items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                            items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
                            15,
                            2,
                            Enchantment.leveledCost(5, 7),
                            Enchantment.leveledCost(25, 9),
                            2,
                            AttributeModifierSlot.MAINHAND))
                    .exclusiveSet(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE_SET))
                    .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                            EnchantmentEffectTarget.ATTACKER, EnchantmentEffectTarget.VICTIM,
                            new LightningStrikerEnchantmentEffect()));

            register(registerable, HEALING, Enchantment.builder(Enchantment.definition(
                            items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                            items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
                            18,
                            3,
                            Enchantment.leveledCost(40, 10),
                            Enchantment.leveledCost(80, 20),
                            1,
                            AttributeModifierSlot.MAINHAND))
                    .exclusiveSet(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE_SET))
                    .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                            EnchantmentEffectTarget.ATTACKER, EnchantmentEffectTarget.VICTIM,
                            new HealingEnchantmentEffect()));

    }
        private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) {
            registry.register(key, builder.build(key.getValue()));
        }

    }
