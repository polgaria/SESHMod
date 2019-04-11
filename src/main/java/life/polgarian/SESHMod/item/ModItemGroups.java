package life.polgarian.SESHMod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	public static final ItemGroup SESH = FabricItemGroupBuilder.build(
		new Identifier("seshmod", "sesh"),
		() -> new ItemStack(ModItems.SESH_ESSENCE)
	).setTexture("seshitems.png");
}
