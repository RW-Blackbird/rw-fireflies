package net.rw.fireflies;

import net.fabricmc.api.ModInitializer;
import net.rw.fireflies.particle.ModParticles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fireflies implements ModInitializer {

	public static final String MOD_ID = "fireflies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModParticles.registerParticles();
	}
}
