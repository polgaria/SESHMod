package com.greg_games.teamseshmod.tabs;

import com.greg_games.teamseshmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SeshTab extends CreativeTabs 
{
	public SeshTab(String label) 
	{
		super("seshtab");
		this.setBackgroundImageName("seshtab.png");
	}
	
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.SESH_ESSENCE);
	}
}
