package life.polgarian.SESHMod.init;

import life.polgarian.SESHMod.items.tools.SESHAxe;
import life.polgarian.SESHMod.items.tools.SESHPickaxe;
import life.polgarian.SESHMod.items.tools.materials.ModArmorMaterials;
import life.polgarian.SESHMod.items.tools.materials.ModToolMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	public static Item MOLTEN_BONE;

	private static Item register(String name, Item item) {
		Registry.register(Registry.ITEM, new Identifier("seshmod", name), item);

		return item;
	}

	public static void init() {
		// Tools
		register("sesh_axe", new SESHAxe(ToolMaterials.DIAMOND, Float.MAX_VALUE, Float.MAX_VALUE, (new Item.Settings()).itemGroup(ItemGroup.TOOLS)));
		register("sesh_pickaxe", new SESHPickaxe(ModToolMaterials.MOLTEN_BONE, Integer.MAX_VALUE, Float.MAX_VALUE, (new Item.Settings()).itemGroup(ItemGroup.TOOLS)));
		register("sesh_spade", new ShovelItem(ModToolMaterials.MOLTEN_BONE, Float.MAX_VALUE, Float.MAX_VALUE, (new Item.Settings()).itemGroup(ItemGroup.TOOLS)));
		register("sesh_sword", new SwordItem(ModToolMaterials.MOLTEN_BONE, Integer.MAX_VALUE, Float.MAX_VALUE, (new Item.Settings()).itemGroup(ItemGroup.TOOLS)));
		register("sesh_hoe", new HoeItem(ModToolMaterials.MOLTEN_BONE, Float.MAX_VALUE, (new Item.Settings()).itemGroup(ItemGroup.TOOLS)));

		// Armor
		register("teamsesh_beanie", new ArmorItem(ModArmorMaterials.SESH, EquipmentSlot.HEAD, (new Item.Settings()).itemGroup(ItemGroup.COMBAT)));
		register("teamsesh_shirt", new ArmorItem(ModArmorMaterials.SESH, EquipmentSlot.CHEST, (new Item.Settings()).itemGroup(ItemGroup.COMBAT)));
		register("teamsesh_pants", new ArmorItem(ModArmorMaterials.SESH, EquipmentSlot.LEGS, (new Item.Settings()).itemGroup(ItemGroup.COMBAT)));
		register("creep_sneakers", new ArmorItem(ModArmorMaterials.SESH, EquipmentSlot.FEET, (new Item.Settings()).itemGroup(ItemGroup.COMBAT)));

		// Miscellaneous
		MOLTEN_BONE = register("molten_bone", new Item(new Item.Settings().itemGroup(ItemGroup.MISC)));
	}
}
