package life.polgarian.SESHMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.lang.reflect.Field;

public class SuicideBlock extends Block {
	public SuicideBlock(Settings blockSettings) {
		super(blockSettings);
	}

	@Override
	public void onSteppedOn(World world, BlockPos blockPos, Entity entity)
	{
		try {
			for (Field field : StatusEffects.class.getDeclaredFields()) {
				StatusEffect statusEffect = (StatusEffect) field.get(this);
				if (statusEffect.getType() == StatusEffectType.HARMFUL && !statusEffect.equals(StatusEffects.LEVITATION) && !statusEffect.equals(StatusEffects.INSTANT_DAMAGE)) {
					((LivingEntity) entity).addPotionEffect(new StatusEffectInstance(statusEffect, 1200, statusEffect.equals(StatusEffects.SLOWNESS) ? 100 : world.random.nextInt(6)));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
