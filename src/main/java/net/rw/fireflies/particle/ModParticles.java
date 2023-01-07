package net.rw.fireflies.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rw.fireflies.Fireflies;

public class ModParticles {

    public static final DefaultParticleType FIREFLY_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles(){
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(Fireflies.MOD_ID, "firefly_particle"),
                FIREFLY_PARTICLE);
    }
}
