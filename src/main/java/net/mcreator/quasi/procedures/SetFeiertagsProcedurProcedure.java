package net.mcreator.quasi.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetFeiertagsProcedurProcedure {
	public static void execute(LevelAccessor world) {
		QuasimodModVariables.WorldVariables.get(world).IsFeiertag = true;
		QuasimodModVariables.WorldVariables.get(world).syncData(world);
	}
}
