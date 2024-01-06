
package net.mcreator.quasi.client.renderer;

public class AllmannRenderer extends HumanoidMobRenderer<AllmannEntity, HumanoidModel<AllmannEntity>> {

	public AllmannRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(AllmannEntity entity) {
		return new ResourceLocation("quasimod:textures/entities/alman.png");
	}

}
