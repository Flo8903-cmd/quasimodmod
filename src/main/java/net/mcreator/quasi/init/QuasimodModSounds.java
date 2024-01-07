
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.quasi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.quasi.QuasimodMod;

public class QuasimodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, QuasimodMod.MODID);
	public static final RegistryObject<SoundEvent> OILDRUMM = REGISTRY.register("oildrumm", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("quasimod", "oildrumm")));
	public static final RegistryObject<SoundEvent> REVOLVER_SHOT = REGISTRY.register("revolver.shot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("quasimod", "revolver.shot")));
	public static final RegistryObject<SoundEvent> BULLETIMPACT = REGISTRY.register("bulletimpact", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("quasimod", "bulletimpact")));
}
