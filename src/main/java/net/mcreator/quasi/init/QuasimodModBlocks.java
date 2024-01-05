
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quasi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.quasi.block.ErtserBlock;
import net.mcreator.quasi.QuasimodMod;

public class QuasimodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, QuasimodMod.MODID);
	public static final RegistryObject<Block> ERTSER = REGISTRY.register("ertser", () -> new ErtserBlock());
}
