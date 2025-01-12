package net.kalgugsu.losemod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent HGFOOD = new FoodComponent.Builder().nutrition(2).saturationModifier(1.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 60), 0.05f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 35), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 75), 0.35f)
            .build();

    public static final FoodComponent CHESTNUT = new FoodComponent.Builder().nutrition(1).saturationModifier(0.0f)
            .build();


    public static final FoodComponent GINSENG = new FoodComponent.Builder().nutrition(1).saturationModifier(0.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 60, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 60, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 0), 1.0f)
            .build();

    public static final FoodComponent OCTOPUS = new FoodComponent.Builder().nutrition(3).saturationModifier(1.0f)
            .build();





}