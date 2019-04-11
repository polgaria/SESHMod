package life.polgarian.SESHMod.blocks;

import life.polgarian.SESHMod.item.ModItemGroups;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tag.FabricItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.Item;
import net.minecraft.item.block.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
	private static void register(String name, Block block) {
		block = Registry.register(Registry.BLOCK, new Identifier("seshmod", name), block);

		BlockItem blockItem = new BlockItem(block, (new Item.Settings()).itemGroup(ModItemGroups.SESH));
		blockItem.registerBlockItemMap(Item.BLOCK_ITEM_MAP, blockItem);

		Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), blockItem);
	}

	public static void registerBlocks() {
		register("sesh_block", new Block(
				FabricBlockSettings
					.of(Material.METAL)
					.strength(5, 6)
					.sounds(BlockSoundGroup.METAL)
					.build()
			)
		);

		register("suicide_block", new SuicideBlock(
				FabricBlockSettings
					.of(Material.WOOD)
					.strength(1, 1)
					.sounds(BlockSoundGroup.ANVIL)
					.build()
			)
		);

		register("seshanium_ore", new OreBlock(
				FabricBlockSettings
					.of(Material.STONE)
					.strength(6, 15)
					.breakByTool(FabricItemTags.PICKAXES, 3)
					.build()
			)
		);
	}
}
