package life.polgarian.SESHMod.blocks;

import life.polgarian.SESHMod.entity.effect.ModStatusEffects;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class SuicideBlock extends Block {
	SuicideBlock(Settings blockSettings) {
		super(blockSettings);
	}

	@Override
	public void onSteppedOn(World world, BlockPos blockPos, Entity entity) {
		for (StatusEffect statusEffect : Registry.STATUS_EFFECT) {
			if (statusEffect.getType() == StatusEffectType.HARMFUL && !statusEffect.equals(StatusEffects.LEVITATION) && !statusEffect.equals(StatusEffects.INSTANT_DAMAGE) && !statusEffect.equals(StatusEffects.BLINDNESS)) {
				((LivingEntity) entity).addPotionEffect(new StatusEffectInstance(
					statusEffect,
					1200,
					statusEffect.equals(StatusEffects.SLOWNESS) || statusEffect.equals(ModStatusEffects.SESH) ? 100 : world.random.nextInt(6)));
			}
		}
	}
}
