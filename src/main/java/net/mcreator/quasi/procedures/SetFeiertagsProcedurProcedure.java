package net.mcreator.quasi.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.quasi.network.QuasimodModVariables;

public class SetFeiertagsProcedurProcedure {
	public static void execute(LevelAccessor world) {
		QuasimodModVariables.WorldVariables.get(world).IsFeiertag = true;
		QuasimodModVariables.WorldVariables.get(world).syncData(world);
	}
}
