package life.polgarian.SESHMod.mixins.common;

import life.polgarian.SESHMod.item.ModItems;
import life.polgarian.SESHMod.potion.ModPotions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SuppressWarnings("unused")
@Mixin(BrewingRecipeRegistry.class)
public abstract class BrewingRecipeRegistryMixin {
	@Shadow
	private static void registerPotionRecipe(Potion potion_1, Item item_1, Potion potion_2) {

	}

	/**
	 * TODO: replace injection with registering in entry point
	 */
	@Inject(
		at = @At(
			value = "RETURN"
		),
		method = "registerDefaults"
	)
	private static void registerSESHPotion(CallbackInfo ci) {
		registerPotionRecipe(Potions.AWKWARD, ModItems.SESH_ESSENCE, ModPotions.SESH);
	}
}
