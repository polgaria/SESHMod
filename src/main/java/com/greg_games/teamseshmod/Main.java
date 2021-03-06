package com.greg_games.teamseshmod;

import com.greg_games.teamseshmod.blocks.ModEntities;
import com.greg_games.teamseshmod.init.ModRecipes;
import com.greg_games.teamseshmod.proxy.CommonProxy;
import com.greg_games.teamseshmod.tabs.SeshTab;
import com.greg_games.teamseshmod.util.Reference;
import com.greg_games.teamseshmod.util.handlers.RegistryHandler;
import com.greg_games.teamseshmod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static final CreativeTabs seshtab = new SeshTab("seshtab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		RegistryHandler.preInitRegistries(event);
	}
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
