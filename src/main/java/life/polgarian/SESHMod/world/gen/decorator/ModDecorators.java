package life.polgarian.SESHMod.world.gen.decorator;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.NopeDecoratorConfig;

public class ModDecorators {
	public static final Decorator<NopeDecoratorConfig> SESHANIUM_ORE = register("seshanium_ore", new SeshaniumOreDecorator(NopeDecoratorConfig::deserialize));

	private static <G extends Decorator<NopeDecoratorConfig>> Decorator<NopeDecoratorConfig> register(String name, G decorator) {
		return Registry.register(Registry.DECORATOR, new Identifier("seshmod", name), decorator);
	}
}
