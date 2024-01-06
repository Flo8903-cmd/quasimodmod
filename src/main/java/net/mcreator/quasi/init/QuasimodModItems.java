
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quasi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.quasi.item.SaltItemItem;
import net.mcreator.quasi.item.RevolverItem;
import net.mcreator.quasi.item.HammerandChiselItem;
import net.mcreator.quasi.item.ConstrucionWandItem;
import net.mcreator.quasi.item.BretzelItem;
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
	public static final RegistryObject<Item> GESTEIN = block(QuasimodModBlocks.GESTEIN);
	public static final RegistryObject<Item> CONSTRUCION_WAND = REGISTRY.register("construcion_wand", () -> new ConstrucionWandItem());
	public static final RegistryObject<Item> HAMMERAND_CHISEL = REGISTRY.register("hammerand_chisel", () -> new HammerandChiselItem());
	public static final RegistryObject<Item> BRETZEL = REGISTRY.register("bretzel", () -> new BretzelItem());
	public static final RegistryObject<Item> SALT = block(QuasimodModBlocks.SALT);
	public static final RegistryObject<Item> SALT_ITEM = REGISTRY.register("salt_item", () -> new SaltItemItem());
	public static final RegistryObject<Item> ALLMANN_SPAWN_EGG = REGISTRY.register("allmann_spawn_egg", () -> new ForgeSpawnEggItem(QuasimodModEntities.ALLMANN, -65536, -3355648, new Item.Properties()));
	public static final RegistryObject<Item> REVOLVER = REGISTRY.register("revolver", () -> new RevolverItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
