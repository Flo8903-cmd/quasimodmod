package net.mcreator.quasi.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HammerandChiselRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == QuasimodModBlocks.GESTEIN.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.COBBLESTONE);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (Math.random() < 0.2) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Blocks.GRANITE);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (Math.random() < 0.1) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.COAL);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else {
						if (Math.random() < 0.1) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(Items.RAW_IRON);
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						} else {
							if (Math.random() < 0.05) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(Blocks.OBSIDIAN);
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
							} else {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD);
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
							}
						}
					}
				}
			}
		}
	}
}
