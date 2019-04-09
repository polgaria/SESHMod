package life.polgarian.SESHMod.init;

import life.polgarian.SESHMod.blocks.SuicideBlock;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.block.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
	private static void register(String name, Block block) {
		block = Registry.register(Registry.BLOCK, new Identifier("seshmod", name), block);

		BlockItem blockItem = new BlockItem(block, (new Item.Settings()).itemGroup(ItemGroup.BUILDING_BLOCKS));
		blockItem.registerBlockItemMap(Item.BLOCK_ITEM_MAP, blockItem);

		Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), blockItem);
	}

	public static void init() {
		register("sesh_block", new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).build()));
		register("suicide_block", new SuicideBlock(FabricBlockSettings.of(Material.WOOD).strength(1F, 1F).sounds(BlockSoundGroup.ANVIL).build()));
	}
}
