package com.greg_games.teamseshmod.util.handlers;

import net.minecraft.entity.Entity;
import com.greg_games.teamseshmod.entity.EntityBones;
import com.greg_games.teamseshmod.entity.render.RenderBones;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBones.class, new IRenderFactory<EntityBones>()
		{
			@Override
			public Render<? super EntityBones> createRenderFor(RenderManager manager)
			{
				return new RenderBones(manager);
			}
		});
	}
}
