package net.mcreator.quasi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.quasi.network.QuasimodModVariables;

public class GetangerfeiertagsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("" + (entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).FeiertagsAnger)), false);
	}
}
