package net.mcreator.quasi.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ConstrucionWandItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("pos1x = " + "pos1x = ")), false);
		}
	}
}
