package life.polgarian.SESHMod.potion;

import life.polgarian.SESHMod.entity.effect.ModStatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPotions {
	private static void  register(String name, Potion potion) {
		Registry.register(Registry.POTION, new Identifier("seshmod", name), potion);
	}

	public static void registerPotions() {
		register("sesh_potion", new Potion(new StatusEffectInstance(ModStatusEffects.SESH, 3600)));
	}
}
