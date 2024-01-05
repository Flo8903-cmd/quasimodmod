
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quasi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.quasi.QuasimodMod;

public class QuasimodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, QuasimodMod.MODID);
	public static final RegistryObject<Item> FABRIK_1 = block(QuasimodModBlocks.FABRIK_1);
	public static final RegistryObject<Item> ERTSER = block(QuasimodModBlocks.ERTSER);
	public static final RegistryObject<Item> FABRIK_2 = block(QuasimodModBlocks.FABRIK_2);
	public static final RegistryObject<Item> FABRIK_3 = block(QuasimodModBlocks.FABRIK_3);
	public static final RegistryObject<Item> FABRIK_4 = block(QuasimodModBlocks.FABRIK_4);
	public static final RegistryObject<Item> FABRIK_5 = block(QuasimodModBlocks.FABRIK_5);
	public static final RegistryObject<Item> OIL_BARREL = block(QuasimodModBlocks.OIL_BARREL);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
