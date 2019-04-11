package life.polgarian.SESHMod.entity.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;

public class ModStatusEffects {
	public static StatusEffect SESH;

	private static StatusEffect register(int id, String name, StatusEffect statusEffect) {
		return (StatusEffect) ((MutableRegistry)Registry.STATUS_EFFECT).set(id, new Identifier("seshmod", name), statusEffect);
	}

	public static void registerEffects() {
		SESH = register(33, "sesh", new SESHStatusEffect(StatusEffectType.HARMFUL, 2039587));
	}
}
