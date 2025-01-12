package net.kalgugsu.losemod.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class HealingEnchantmentEffect implements EnchantmentEntityEffect {
    public static final MapCodec<HealingEnchantmentEffect> CODEC = MapCodec.unit(HealingEnchantmentEffect::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if (user instanceof LivingEntity livingEntity) {
            // 크리티컬 히트 여부 확인

            // 치유량 계산
            float healingAmount = 4.0f + (level - 1) * 2.0f; // 레벨에 따라 치유량 증가
            livingEntity.heal(healingAmount); // 자기 자신 치유

            // 주변 엔티티 치유
            Box area = user.getBoundingBox().expand(2.0D); // 반경 2블록
            List<Entity> nearbyEntities = world.getOtherEntities(
                    user,
                    area,
                    entity -> entity instanceof LivingEntity
            );

            float nearbyHealingAmount = healingAmount / 2; // 주변 치유량은 절반
            for (Entity entity : nearbyEntities) {
                if (entity instanceof LivingEntity target) {
                    target.heal(nearbyHealingAmount);
                }
            }
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
