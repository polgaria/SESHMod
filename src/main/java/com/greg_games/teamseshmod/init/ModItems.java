package com.greg_games.teamseshmod.init;

import java.util.ArrayList;
import java.util.List;

import com.greg_games.teamseshmod.items.ItemBase;
import com.greg_games.teamseshmod.items.tools.ToolPickaxe;
import com.greg_games.teamseshmod.items.tools.ToolSpade;
import com.greg_games.teamseshmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_MOLTEN_BONE = EnumHelper.addToolMaterial("material_molten_bone", 5, 10000, Float.MAX_VALUE, Float.MAX_VALUE, 666);
	
	//Items
	public static final Item TEAMSESH_SHIRT = new ItemBase("teamsesh_shirt");
	public static final Item MOLTEN_BONE = new ItemBase("molten_bone");
	
	//Tools
	public static final ItemSword SESH_SWORD = new ToolSword("sesh_sword", MATERIAL_MOLTEN_BONE);
	public static final ItemPickaxe SESH_PICKAXE = new ToolPickaxe("sesh_pickaxe", MATERIAL_MOLTEN_BONE);
	public static final ItemSpade SESH_SPADE = new ToolSpade("sesh_spade", MATERIAL_MOLTEN_BONE);
	
}
