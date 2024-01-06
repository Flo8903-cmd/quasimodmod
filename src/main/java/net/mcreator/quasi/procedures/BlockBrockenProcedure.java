package net.mcreator.quasi.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.quasi.network.QuasimodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlockBrockenProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (QuasimodModVariables.WorldVariables.get(world).IsFeiertag == true) {
			{
				double _setval = (entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new QuasimodModVariables.PlayerVariables())).FeiertagsAnger + 1;
				entity.getCapability(QuasimodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FeiertagsAnger = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("H\u00D6MMA. ES IST FEIERTACHS H\u00D6HRE SOFORT AUF ZU ARBEIDEN!"), false);
		}
	}
}
