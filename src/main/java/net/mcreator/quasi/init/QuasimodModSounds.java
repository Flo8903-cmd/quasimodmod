
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
	public static final RegistryObject<SoundEvent> GMBH_LIVING = REGISTRY.register("gmbh_living", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("quasimod", "gmbh_living")));
	public static final RegistryObject<SoundEvent> GMBH_HURT = REGISTRY.register("gmbh_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("quasimod", "gmbh_hurt")));
	public static final RegistryObject<SoundEvent> GMBH_DEATH = REGISTRY.register("gmbh_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("quasimod", "gmbh_death")));
	public static final RegistryObject<SoundEvent> OILDRUMM = REGISTRY.register("oildrumm", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("quasimod", "oildrumm")));
}
