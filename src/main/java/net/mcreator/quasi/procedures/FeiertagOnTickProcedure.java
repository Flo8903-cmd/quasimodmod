package net.mcreator.quasi.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.quasi.network.QuasimodModVariables;
import net.mcreator.quasi.init.QuasimodModEntities;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FeiertagOnTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (QuasimodModVariables.WorldVariables.get(world).IsFeiertag == true) {
			if ((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).FeiertagsAnger < 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = QuasimodModEntities.ALLMANN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					double _setval = (entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).FeiertagsAnger - 1;
					entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FeiertagsAnger = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).FeiertagsAnger < 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.CAMEL.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					{
						double _setval = (entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).FeiertagsAnger - 2;
						entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.FeiertagsAnger = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
