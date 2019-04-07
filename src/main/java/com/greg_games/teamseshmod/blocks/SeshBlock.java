package com.greg_games.teamseshmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SeshBlock extends BlockBase 
{

	public SeshBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.GROUND);
		setHardness(Float.MAX_VALUE);
		setResistance(Float.MAX_VALUE);
		setBlockUnbreakable();
	}

}
