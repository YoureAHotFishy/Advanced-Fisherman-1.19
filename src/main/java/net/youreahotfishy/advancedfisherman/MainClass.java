package net.youreahotfishy.advancedfisherman;

import net.fabricmc.api.ModInitializer;
import net.youreahotfishy.advancedfisherman.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass implements ModInitializer {

	public static final String MOD_ID = "advancedfisherman";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		LOGGER.info("Mod Loaded.");
	}
}
