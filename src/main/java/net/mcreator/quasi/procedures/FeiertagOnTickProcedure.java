package net.mcreator.quasi.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FeiertagOnTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z
) {
if (QuasimodModVariables.WorldVariables.get(world).IsFeiertag==true) {if (<2) {if (world instanceof ServerLevel _level) {
Entity entityToSpawn = QuasimodModEntities.ALLMANN.get().spawn(_level, BlockPos.containing(x,y,z), MobSpawnType.MOB_SUMMONED);
if (entityToSpawn != null) {
entityToSpawn.setDeltaMovement(0, 0, 0);
}
}
if (<5) {if (world instanceof ServerLevel _level) {
Entity entityToSpawn = EntityType.CAMEL.spawn(_level, BlockPos.containing(x,y,z), MobSpawnType.MOB_SUMMONED);
if (entityToSpawn != null) {
entityToSpawn.setDeltaMovement(0, 0, 0);
}
}
}}}
}
}
