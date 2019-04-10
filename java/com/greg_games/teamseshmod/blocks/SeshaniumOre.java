package com.greg_games.teamseshmod.blocks;

import java.util.Random;

import com.greg_games.teamseshmod.init.ModBlocks;
import com.greg_games.teamseshmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SeshaniumOre extends BlockBase {
	
	public SeshaniumOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(6.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.SESHANIUM_POWDER;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max-min) + min;
	}
	
}

