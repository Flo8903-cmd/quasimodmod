package net.mcreator.quasi.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.quasi.item.RevolverItem;

public class RevolverItemModel extends GeoModel<RevolverItem> {
	@Override
	public ResourceLocation getAnimationResource(RevolverItem animatable) {
		return new ResourceLocation("quasimod", "animations/revolver.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RevolverItem animatable) {
		return new ResourceLocation("quasimod", "geo/revolver.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RevolverItem animatable) {
		return new ResourceLocation("quasimod", "textures/item/revolver.png");
	}
}
