package life.polgarian.SESHMod.world.gen.decorator;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.decorator.NopeDecoratorConfig;
import net.minecraft.world.gen.decorator.SimpleDecorator;

import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SeshaniumOreDecorator extends SimpleDecorator<NopeDecoratorConfig> {
	SeshaniumOreDecorator(Function<Dynamic<?>, ? extends NopeDecoratorConfig> function) {
		super(function);
	}

	@Override
	protected Stream<BlockPos> getPositions(Random random, NopeDecoratorConfig config, BlockPos blockPos) {
		int int_1 = 3 + random.nextInt(6);
		return IntStream.range(0, int_1).mapToObj((int_1x) -> {
			int x = random.nextInt(16);
			int y = random.nextInt(8) + 4;
			int z = random.nextInt(16);
			return blockPos.add(x, y, z);
		});
	}
}
