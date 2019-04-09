package life.polgarian.SESHMod.mixins.common;

import net.minecraft.entity.EntityCategory;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@SuppressWarnings("unused")
@Mixin(Biome.class)
public interface BiomeMixin {
	@Invoker
	void invokeAddSpawn(EntityCategory entityCategory, Biome.SpawnEntry spawnEntry);
}
