package life.polgarian.SESHMod.mixins.client;

import life.polgarian.SESHMod.item.ModItemGroups;
import net.minecraft.client.gui.ingame.CreativePlayerInventoryScreen;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@SuppressWarnings("unused")
@Mixin(CreativePlayerInventoryScreen.class)
public abstract class CreativePlayerInventoryScreenMixin {
	@Shadow
	@Final
	@Mutable
	private static Identifier TEXTURE = new Identifier("textures/gui/container/creative_inventory/tabs.png");

	@Inject(
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/client/texture/TextureManager;bindTexture(Lnet/minecraft/util/Identifier;)V",
			ordinal = 0
		),
		method = "drawBackground",
		locals = LocalCapture.CAPTURE_FAILHARD
	)
	private void setSESHBackground(float float_1, int int_1, int int_2, CallbackInfo ci, ItemGroup selected, ItemGroup[] itemGroups, int groupCount, int forLoop, ItemGroup forItemGroup) {
		TEXTURE = forItemGroup.equals(ModItemGroups.SESH) ? new Identifier("seshmod", "textures/gui/container/creative_inventory/tabs.png") : new Identifier("textures/gui/container/creative_inventory/tabs.png");
	}

	@Inject(
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/client/texture/TextureManager;bindTexture(Lnet/minecraft/util/Identifier;)V",
			ordinal = 1
		),
		method = "drawBackground",
		locals = LocalCapture.CAPTURE_FAILHARD
	)
	private void setSESHBackground(float float_1, int int_1, int int_2, CallbackInfo ci, ItemGroup selected) {
		TEXTURE = selected.equals(ModItemGroups.SESH) ? new Identifier("seshmod", "textures/gui/container/creative_inventory/tabs.png") : new Identifier("textures/gui/container/creative_inventory/tabs.png");
	}
}
