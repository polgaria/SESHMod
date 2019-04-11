package life.polgarian.SESHMod.mixins.client;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import life.polgarian.SESHMod.entity.effect.ModStatusEffects;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.GlAllocationUtils;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.nio.FloatBuffer;

@SuppressWarnings("unused")
@Mixin(BackgroundRenderer.class)
public abstract class BackgroundRendererMixin {
	@Shadow
	@Final
	private GameRenderer gameRenderer;

	private final FloatBuffer greenColorBuffer = GlAllocationUtils.allocateFloatBuffer(16);

	@Inject(
		at = @At(
			value = "RETURN"
		),
		method = "<init>"
	)
	private void setGreenColorBuffer(GameRenderer gameRenderer, CallbackInfo ci) {
		this.greenColorBuffer.put(0).put(1).put(0).put(1).flip();
	}

	@Inject(
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/client/render/Camera;getFocusedEntity()Lnet/minecraft/entity/Entity;",
			ordinal = 0
		),
		method = "applyFog"
	)
	private void applyFogSESHEffect(Camera camera, int int_1, CallbackInfo ci) {
		if (camera.getFocusedEntity() instanceof LivingEntity && ((LivingEntity) camera.getFocusedEntity()).hasStatusEffect(ModStatusEffects.SESH)) {
			GlStateManager.fog(2918, this.greenColorBuffer);
			float float_3 = 5.0F;
			int int_2 = ((LivingEntity) camera.getFocusedEntity()).getStatusEffect(ModStatusEffects.SESH).getDuration();
			if (int_2 < 20) {
				float_3 = MathHelper.lerp(1.0F - (float) int_2 / 20.0F, 5.0F, this.gameRenderer.getViewDistance());
			}

			GlStateManager.fogMode(GlStateManager.FogMode.LINEAR);
			GlStateManager.fogDensity(10);
			if (int_1 == -1) {
				GlStateManager.fogStart(0.0F);
				GlStateManager.fogEnd(float_3 * 0.8F);
			} else {
				GlStateManager.fogStart(float_3 * 0.25F);
				GlStateManager.fogEnd(float_3);
			}

			GLX.setupNvFogDistance();
		}
	}
}
