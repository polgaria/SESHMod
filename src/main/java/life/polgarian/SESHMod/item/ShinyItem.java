package life.polgarian.SESHMod.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ShinyItem extends Item {
	public ShinyItem(Settings itemSettings) {
		super(itemSettings);
	}

	@Environment(EnvType.CLIENT)
	public boolean hasEnchantmentGlint(ItemStack itemStack) {
		return true;
	}
}
