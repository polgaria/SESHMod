package life.polgarian.SESHMod.entity.renderer;

import life.polgarian.SESHMod.entity.BonesEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.util.Identifier;

public class BonesEntityRenderer extends MobEntityRenderer<BonesEntity, ZombieEntityModel<BonesEntity>> {
	public BonesEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new ZombieEntityModel<>(), 1F);
	}

	@Override
	protected Identifier getTexture(BonesEntity bonesEntity) {
		return new Identifier("seshmod", "textures/entity/bones.png");
	}
}
