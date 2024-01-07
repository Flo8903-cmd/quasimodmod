package net.mcreator.quasi.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.quasi.network.QuasimodModVariables;
import net.mcreator.quasi.entity.AllmannEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerKillsAllmannProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof AllmannEntity) {
			{
				double _setval = (entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).FeiertagsAnger + 3;
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FeiertagsAnger = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
