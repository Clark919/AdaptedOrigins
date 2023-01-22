package com.clarkster.adaptedorigins;

import com.clarkster.adaptedorigins.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AdaptedOriginsMod implements ModInitializer {
	public static final String MOD_ID = "adaptedorigins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
