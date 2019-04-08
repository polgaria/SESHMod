package life.polgarian.SESHMod.init;

import life.polgarian.SESHMod.items.tools.SESHAxe;
import life.polgarian.SESHMod.items.tools.SESHPickaxe;
import life.polgarian.SESHMod.items.tools.materials.ModToolMaterials;
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
		register("sesh_axe", new SESHAxe(ToolMaterials.DIAMOND, 5.0F, -3.0F, (new Item.Settings()).itemGroup(ItemGroup.TOOLS)));
		register("sesh_pickaxe", new SESHPickaxe(ModToolMaterials.MOLTEN_BONE, 5, -3.0F, (new Item.Settings()).itemGroup(ItemGroup.TOOLS)));
		register("sesh_spade", new ShovelItem(ModToolMaterials.MOLTEN_BONE, 5.0F, -3.0F, (new Item.Settings()).itemGroup(ItemGroup.TOOLS)));
		register("sesh_sword", new SwordItem(ModToolMaterials.MOLTEN_BONE, 5, -3.0F, (new Item.Settings()).itemGroup(ItemGroup.TOOLS)));

		MOLTEN_BONE = register("molten_bone", new Item(new Item.Settings().itemGroup(ItemGroup.MISC)));
	}
}
