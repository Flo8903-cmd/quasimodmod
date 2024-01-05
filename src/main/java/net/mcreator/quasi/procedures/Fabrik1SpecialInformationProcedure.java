package net.mcreator.quasi.procedures;

import net.minecraft.network.chat.Component;

import java.util.List;

public class Fabrik1SpecialInformationProcedure {
	public static void execute(List<Component> tooltip) {
		if (tooltip == null)
			return;
		tooltip.add(Component.literal("grated floor"));
	}
}
