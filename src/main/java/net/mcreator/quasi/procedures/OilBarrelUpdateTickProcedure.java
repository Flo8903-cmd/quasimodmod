package net.mcreator.quasi.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.quasi.init.QuasimodModBlocks;

public class OilBarrelUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BUBBLE_COLUMN
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER)
				&& ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.BUBBLE_COLUMN
						|| (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.WATER)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.BUBBLE_COLUMN_UP, x, y, z, 15, 3, 3, 3, 1);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), QuasimodModBlocks.OIL_BARREL.get().defaultBlockState(), 3);
		}
	}
}
