package net.rw.fireflies.block;

import net.minecraft.block.*;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.World;
import net.rw.fireflies.particle.ModParticles;

import javax.swing.text.html.BlockView;

public class FireflyJar extends LanternBlock {


    public FireflyJar(Settings settings) {
        super(settings);


    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double d = (double)pos.getX() + 0.6;
        double e = (double)pos.getY();
        double f = (double)pos.getZ() + 0.6;
        world.addParticle(ModParticles.FIREFLY_PARTICLE, true, d, e, f, 0.0, 0.0, 0.0);
    }


}
