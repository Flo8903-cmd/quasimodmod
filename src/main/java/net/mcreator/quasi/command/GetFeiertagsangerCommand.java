
package net.mcreator.quasi.command;

@Mod.EventBusSubscriber
public class GetFeiertagsangerCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("getfeiertagsanger")

		);
	}

}
