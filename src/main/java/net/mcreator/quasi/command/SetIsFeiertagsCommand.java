
package net.mcreator.quasi.command;

@Mod.EventBusSubscriber
public class SetIsFeiertagsCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setisfeiertags").requires(s -> s.hasPermission(3)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();

			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();

			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);

			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetFeiertagsProcedurProcedure.execute(world);
			return 0;
		}));
	}

}
