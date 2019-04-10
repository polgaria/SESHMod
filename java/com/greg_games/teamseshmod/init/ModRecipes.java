package com.greg_games.teamseshmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(Items.BONE, new ItemStack(ModItems.MOLTEN_BONE, 1), 0.15f);
	}

}
