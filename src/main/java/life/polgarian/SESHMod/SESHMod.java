package life.polgarian.SESHMod;

import life.polgarian.SESHMod.entity.BonesEntity;
import life.polgarian.SESHMod.init.ModBlocks;
import life.polgarian.SESHMod.init.ModItems;
import life.polgarian.SESHMod.mixins.common.BiomeMixin;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EntityCategory;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

@SuppressWarnings("unused")
public class SESHMod implements ModInitializer {
	@Override
	public void onInitialize() {
		ModBlocks.init();
		ModItems.init();

		SESHMod.addBonesEntitySpawn();
	}

	private static void addBonesEntitySpawn() {
		Biome.SpawnEntry bonesSpawnEntry = new Biome.SpawnEntry(BonesEntity.BONES, 5, 1, 10);

		((BiomeMixin)Biomes.BADLANDS).invokeAddSpawn(EntityCategory.MONSTER, bonesSpawnEntry);
		((BiomeMixin)Biomes.BADLANDS_PLATEAU).invokeAddSpawn(EntityCategory.MONSTER, bonesSpawnEntry);
	}
}