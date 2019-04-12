package com.greg_games.teamseshmod.items.tools;

import com.greg_games.teamseshmod.Main;
import com.greg_games.teamseshmod.init.ModItems;
import com.greg_games.teamseshmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, Float.MAX_VALUE, Float.MAX_VALUE);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.seshtab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
