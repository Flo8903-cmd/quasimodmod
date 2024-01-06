
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quasi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.quasi.block.SaltBlock;
import net.mcreator.quasi.block.OilBarrelBlock;
import net.mcreator.quasi.block.GesteinBlock;
import net.mcreator.quasi.block.Fabrik5Block;
import net.mcreator.quasi.block.Fabrik4Block;
import net.mcreator.quasi.block.Fabrik3Block;
import net.mcreator.quasi.block.Fabrik2Block;
import net.mcreator.quasi.block.Fabrik1Block;
import net.mcreator.quasi.block.ErtserBlock;
import net.mcreator.quasi.QuasimodMod;

public class QuasimodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, QuasimodMod.MODID);
	public static final RegistryObject<Block> FABRIK_1 = REGISTRY.register("fabrik_1", () -> new Fabrik1Block());
	public static final RegistryObject<Block> ERTSER = REGISTRY.register("ertser", () -> new ErtserBlock());
	public static final RegistryObject<Block> FABRIK_2 = REGISTRY.register("fabrik_2", () -> new Fabrik2Block());
	public static final RegistryObject<Block> FABRIK_3 = REGISTRY.register("fabrik_3", () -> new Fabrik3Block());
	public static final RegistryObject<Block> FABRIK_4 = REGISTRY.register("fabrik_4", () -> new Fabrik4Block());
	public static final RegistryObject<Block> FABRIK_5 = REGISTRY.register("fabrik_5", () -> new Fabrik5Block());
	public static final RegistryObject<Block> OIL_BARREL = REGISTRY.register("oil_barrel", () -> new OilBarrelBlock());
	public static final RegistryObject<Block> GESTEIN = REGISTRY.register("gestein", () -> new GesteinBlock());
	public static final RegistryObject<Block> SALT = REGISTRY.register("salt", () -> new SaltBlock());
}
