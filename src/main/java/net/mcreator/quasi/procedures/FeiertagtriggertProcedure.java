package net.mcreator.quasi.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FeiertagtriggertProcedure {
	public static void execute(LevelAccessor world) {
		if (world.dayTime() == 0) {
			if (Math.random() < 0.14) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("HEUTE IST FEIERTAG WER ARBEITET KOMMT IN DIE H\u00D6LLE"), false);
			}
		}
	}
}
