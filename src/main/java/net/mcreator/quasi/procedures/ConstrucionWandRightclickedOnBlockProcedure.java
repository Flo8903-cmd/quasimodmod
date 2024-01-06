package net.mcreator.quasi.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.quasi.network.QuasimodModVariables;

public class ConstrucionWandRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).constructionwandstate == 0) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 2);
			{
				double _setval = 1;
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.constructionwandstate = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Pos1X = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Pos1Y = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Pos1Z = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Position 1"), false);
		} else if ((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).constructionwandstate == 1) {
			{
				double _setval = 0;
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.constructionwandstate = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
			{
				double _setval = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Pos2X = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Pos2Y = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Pos2Z = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("fill " + (((((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).Pos1X + " ") + ""
								+ (((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).Pos1Y + " ") + ""
										+ ((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).Pos1Z + " ")))
								+ ""
								+ (((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).Pos2X + " ") + ""
										+ (((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).Pos2Y + " ") + ""
												+ ((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).Pos2Z + " "))))
								+ "stone")));
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Selection filled"), false);
		}
	}
}
