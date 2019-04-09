package com.greg_games.teamseshmod.init;

import java.util.ArrayList;
import java.util.List;

import com.greg_games.teamseshmod.items.ItemBase;
import com.greg_games.teamseshmod.items.armor.ArmorBase;
import com.greg_games.teamseshmod.items.tools.ToolAxe;
import com.greg_games.teamseshmod.items.tools.ToolHoe;
import com.greg_games.teamseshmod.items.tools.ToolPickaxe;
import com.greg_games.teamseshmod.items.tools.ToolSpade;
import com.greg_games.teamseshmod.items.tools.ToolSword;
import com.greg_games.teamseshmod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_SESH = EnumHelper.addToolMaterial("material_sesh", 5, 10000, Float.MAX_VALUE, Float.MAX_VALUE, 666);
	public static final ArmorMaterial ARMOR_MATERIAL_SESH = EnumHelper.addArmorMaterial("armor_material_sesh", Reference.MOD_ID + ":sesh", 6666, new int[] {666, 666, 666, 666}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Float.MAX_VALUE);
	
	//Items
	public static final Item MOLTEN_BONE = new ItemBase("molten_bone");
	public static final Item SESHANIUM_POWDER = new ItemBase("seshanium_powder");
	public static final Item SESH_ESSENCE = new ItemBase("sesh_essence");
	public static final Item SESH_HANDLE = new ItemBase("sesh_handle");
	
	//Tools
	public static final ItemSword SESH_SWORD = new ToolSword("sesh_sword", MATERIAL_SESH);
	public static final ItemPickaxe SESH_PICKAXE = new ToolPickaxe("sesh_pickaxe", MATERIAL_SESH);
	public static final ItemSpade SESH_SPADE = new ToolSpade("sesh_spade", MATERIAL_SESH);
	public static final ItemAxe SESH_AXE = new ToolAxe("sesh_axe", MATERIAL_SESH);
	public static final ItemHoe SESH_HOE = new ToolHoe("sesh_hoe", MATERIAL_SESH);
	
	//Armor
	public static final Item TEAMSESH_BEANIE = new ArmorBase("teamsesh_beanie", ARMOR_MATERIAL_SESH, 1, EntityEquipmentSlot.HEAD);
	public static final Item TEAMSESH_SHIRT = new ArmorBase("teamsesh_shirt", ARMOR_MATERIAL_SESH, 1, EntityEquipmentSlot.CHEST);
	public static final Item TEAMSESH_PANTS = new ArmorBase("teamsesh_pants", ARMOR_MATERIAL_SESH, 2, EntityEquipmentSlot.LEGS);
	public static final Item CREEP_SNEAKERS = new ArmorBase("creep_sneakers", ARMOR_MATERIAL_SESH, 1, EntityEquipmentSlot.FEET);
	
}
