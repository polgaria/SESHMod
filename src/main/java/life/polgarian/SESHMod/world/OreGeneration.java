package life.polgarian.SESHMod.world;

import life.polgarian.SESHMod.world.gen.decorator.ModDecorators;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.DecoratorConfig;
import net.minecraft.world.gen.feature.EmeraldOreFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class OreGeneration {
	public static void registerOres() {
		for (Biome biome : Registry.BIOME) {
			biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
				Biome.configureFeature(
					Feature.EMERALD_ORE,
					new EmeraldOreFeatureConfig(
						Blocks.STONE.getDefaultState(),
						Registry.BLOCK.get(new Identifier("seshmod", "seshanium_ore")).getDefaultState()
					),
					ModDecorators.SESHANIUM_ORE,
					DecoratorConfig.DEFAULT
				)
			);
		}
	}
}
