package life.polgarian.SESHMod.item.tools.materials;

import life.polgarian.SESHMod.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
	SESH(4, 10000, Float.MAX_VALUE, Float.MAX_VALUE, 666, () -> {
		return Ingredient.ofItems(ModItems.SESH_ESSENCE);
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
