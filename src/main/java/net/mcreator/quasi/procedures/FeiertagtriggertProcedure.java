package net.mcreator.quasi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import net.mcreator.quasi.network.QuasimodModVariables;

public class FeiertagtriggertProcedure {
	public static void execute(LevelAccessor world) {
		if (world.dayTime() == 0) {
			if (Math.random() < 0.14) {
				QuasimodModVariables.WorldVariables.get(world).IsFeiertag = true;
				QuasimodModVariables.WorldVariables.get(world).syncData(world);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("HEUTE IST FEIERTAG WER ARBEITET KOMMT IN DIE H\u00D6LLE"), false);
			}
		}
	}
}
