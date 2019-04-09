package life.polgarian.SESHMod;

import life.polgarian.SESHMod.entity.BonesEntity;
import life.polgarian.SESHMod.entity.renderer.BonesEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;

@SuppressWarnings("unused")
public class SESHClientMod implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.INSTANCE.register(BonesEntity.class, ((entityRenderDispatcher, context) -> new BonesEntityRenderer(entityRenderDispatcher)));
	}
}
