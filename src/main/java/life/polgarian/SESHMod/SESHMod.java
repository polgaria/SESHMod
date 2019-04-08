package life.polgarian.SESHMod;

import life.polgarian.SESHMod.init.ModBlocks;
import life.polgarian.SESHMod.init.ModItems;
import net.fabricmc.api.ModInitializer;

@SuppressWarnings("unused")
public class SESHMod implements ModInitializer {
	@Override
	public void onInitialize() {
		ModBlocks.init();
		ModItems.init();
	}
}