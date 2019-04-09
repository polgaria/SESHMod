package life.polgarian.SESHMod.entity;

import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

@SuppressWarnings("EntityConstructor")
public class BonesEntity extends ZombieEntity {
	public static final EntityType<BonesEntity> BONES = Registry.register(
		Registry.ENTITY_TYPE,
		new Identifier("seshmod", "bones"),
		FabricEntityTypeBuilder.create(EntityCategory.MONSTER, BonesEntity::new).size(EntitySize.constant(1, 2)).build()
	);

	private BonesEntity(EntityType<? extends ZombieEntity> entityType, World world) {
		super(entityType, world);
	}
}
