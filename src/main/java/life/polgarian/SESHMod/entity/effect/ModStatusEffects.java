package life.polgarian.SESHMod.entity.effect;

import jdk.net.SocketFlow;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;

public class ModStatusEffects {
	public static StatusEffect SESH = register(33, "sesh", new SESHStatusEffect(StatusEffectType.HARMFUL, 2039587));

	private static StatusEffect register(int id, String name, StatusEffect statusEffect) {
		return (StatusEffect) ((MutableRegistry)Registry.STATUS_EFFECT).set(id, new Identifier("seshmod", name), statusEffect);
	}
}
