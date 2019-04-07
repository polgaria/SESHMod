package com.greg_games.teamseshmod.init;

import java.util.ArrayList;
import java.util.List;

import com.greg_games.teamseshmod.blocks.BlockBase;
import com.greg_games.teamseshmod.blocks.SeshBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SESH_BLOCK = new SeshBlock("sesh_block", Material.IRON);

}
