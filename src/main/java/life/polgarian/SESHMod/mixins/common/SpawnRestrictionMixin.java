package life.polgarian.SESHMod.mixins.common;

import life.polgarian.SESHMod.entity.BonesEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.sortme.SpawnRestriction;
import net.minecraft.world.gen.Heightmap;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.lang.reflect.Constructor;
import java.util.Map;

@Mixin(SpawnRestriction.class)
public abstract class SpawnRestrictionMixin {
	@Shadow
	@Final
	private static Map mapping;

	@Inject(
		at = @At(
			"HEAD"
		),
		method = "register"
	)
	private static void addBonesEntityToSpawnRestrictions(EntityType<?> entityType, SpawnRestriction.Location location, Heightmap.Type heightmapType, CallbackInfo ci) {
		if (entityType == EntityType.ZOMBIE) {
			for (Class<?> cls : SpawnRestriction.class.getDeclaredClasses()) {
				if (!cls.isEnum()) {
					for (Constructor ctor : cls.getConstructors()) {
						ctor.setAccessible(true);

						try {
							mapping.put(BonesEntity.BONES, ctor.newInstance(heightmapType, location));

							break;
						} catch (Exception ignore) {

						}
					}
				}
			}
		}
	}
}

