package life.polgarian.SESHMod.items.tools.materials;

import life.polgarian.SESHMod.init.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
	MOLTEN_BONE(4, 250, 6.0F, 2.0F, 14, () -> {
		return Ingredient.ofItems(ModItems.MOLTEN_BONE);
	});

	private final int miningLevel;
	private final int durability;
	private final float blockBreakSpeed;
	private final float attackDamage;
	private final int enchantability;
	private final Lazy<Ingredient> repairIngredient;

	ModToolMaterials(int miningLevel, int durability, float blockBreakSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
		this.miningLevel = miningLevel;
		this.durability = durability;
		this.blockBreakSpeed = blockBreakSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairIngredient = new Lazy<>(repairIngredient);
	}

	public int getDurability() {
		return this.durability;
	}

	public float getBlockBreakingSpeed() {
		return this.blockBreakSpeed;
	}

	public float getAttackDamage() {
		return this.attackDamage;
	}

	public int getMiningLevel() {
		return this.miningLevel;
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}
}
