package com.greg_games.teamseshmod.blocks;

import com.greg_games.teamseshmod.Main;
import com.greg_games.teamseshmod.entity.EntityBones;
import com.greg_games.teamseshmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities 
{
	public static void registerEntities() 
	{
		registerEntity("bones", EntityBones.class, Reference.ENTITY_BONES, 20, 16777215, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}

}
