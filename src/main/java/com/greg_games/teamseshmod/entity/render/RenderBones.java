package com.greg_games.teamseshmod.entity.render;

import com.greg_games.teamseshmod.entity.EntityBones;
import com.greg_games.teamseshmod.entity.model.ModelBones;
import com.greg_games.teamseshmod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBones extends RenderLiving<EntityBones>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/bones.png");
	
	public RenderBones(RenderManager manager)
	{
		super(manager, new ModelBones(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBones entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityBones entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
