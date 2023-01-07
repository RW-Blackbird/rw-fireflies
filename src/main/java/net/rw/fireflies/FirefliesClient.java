package net.rw.fireflies;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import net.rw.fireflies.particle.FireflyParticle;
import net.rw.fireflies.particle.ModParticles;

public class FirefliesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIREFLY_JAR, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(ModParticles.FIREFLY_PARTICLE, FireflyParticle.Factory::new);

    }
}
