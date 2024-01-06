package net.mcreator.quasi.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ConstrucionWandRightclickedOnBlockProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
ItemStack itemstack
) {
if(
entity == null
) return ;
if (==0) {if(entity instanceof Player _player)
_player.getCooldowns().addCooldown(itemstack.getItem(), 2);if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("Position 1"), false);}else if (==1) {if(entity instanceof Player _player)
_player.getCooldowns().addCooldown(itemstack.getItem(), 10);if (world instanceof ServerLevel _level)
_level.getServer().getCommands().performPrefixedCommand(
new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), ("fill "+((((+" ")+""+((+" ")+""+(+" ")))+""+((+" ")+""+((+" ")+""+(+" "))))+"stone")));if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("Selection filled"), false);}
}
}
