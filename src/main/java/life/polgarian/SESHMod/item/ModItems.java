package life.polgarian.SESHMod.item;

import life.polgarian.SESHMod.item.tools.SESHAxe;
import life.polgarian.SESHMod.item.tools.SESHPickaxe;
import life.polgarian.SESHMod.item.tools.materials.ModArmorMaterials;
import life.polgarian.SESHMod.item.tools.materials.ModToolMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
	public static final Item SESH_ESSENCE = register("sesh_essence", new ShinyItem(
			new Item.Settings()
				.itemGroup(ModItemGroups.SESH)
				.rarity(Rarity.EPIC)
		)
	);

	private static Item register(String name, Item item) {
		Registry.register(Registry.ITEM, new Identifier("seshmod", name), item);

		return item;
	}

	public static void registerItems() {
		// Tools
		register("sesh_sword", new SwordItem(
				ModToolMaterials.SESH,
				Integer.MAX_VALUE,
				Float.MAX_VALUE,
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
			)
		);

		register("sesh_spade", new ShovelItem(
				ModToolMaterials.SESH,
				Float.MAX_VALUE,
				Float.MAX_VALUE,
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
			)
		);

		register("sesh_pickaxe", new SESHPickaxe(
				ModToolMaterials.SESH,
				Integer.MAX_VALUE,
				Float.MAX_VALUE,
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
			)
		);

		register("sesh_axe", new SESHAxe(
				ToolMaterials.DIAMOND,
				Float.MAX_VALUE,
				Float.MAX_VALUE,
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
			)
		);

		register("sesh_hoe", new HoeItem(
				ModToolMaterials.SESH,
				Float.MAX_VALUE,
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
			)
		);


		// Armor
		register("teamsesh_beanie", new ArmorItem(
				ModArmorMaterials.SESH,
				EquipmentSlot.HEAD,
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
			)
		);

		register("teamsesh_shirt", new ArmorItem(
				ModArmorMaterials.SESH,
				EquipmentSlot.CHEST,
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
			)
		);

		register("teamsesh_pants", new ArmorItem(
				ModArmorMaterials.SESH,
				EquipmentSlot.LEGS,
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
			)
		);

		register("creep_sneakers", new ArmorItem(
				ModArmorMaterials.SESH,
				EquipmentSlot.FEET,
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
			)
		);


		// Materials
		register("seshanium_powder", new Item(
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
					.rarity(Rarity.RARE)
			)
		);


		register("sesh_handle", new ShinyItem(
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
					.rarity(Rarity.EPIC)
			)
		);


		// Miscellaneous
		register("molten_bone", new Item(
				new Item.Settings()
					.itemGroup(ModItemGroups.SESH)
					.rarity(Rarity.UNCOMMON)
			)
		);
	}
}
