
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quasi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.quasi.QuasimodMod;

public class QuasimodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuasimodMod.MODID);
	public static final RegistryObject<CreativeModeTab> QUASI_BLOCKS = REGISTRY.register("quasi_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.quasimod.quasi_blocks")).icon(() -> new ItemStack(QuasimodModBlocks.ERTSER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(QuasimodModBlocks.FABRIK_1.get().asItem());
				tabData.accept(QuasimodModBlocks.FABRIK_2.get().asItem());
				tabData.accept(QuasimodModBlocks.FABRIK_3.get().asItem());
				tabData.accept(QuasimodModBlocks.FABRIK_4.get().asItem());
				tabData.accept(QuasimodModBlocks.FABRIK_5.get().asItem());
				tabData.accept(QuasimodModBlocks.OIL_BARREL.get().asItem());
				tabData.accept(QuasimodModBlocks.GESTEIN.get().asItem());
				tabData.accept(QuasimodModItems.HAMMERAND_CHISEL.get());
			})

					.build());
}
