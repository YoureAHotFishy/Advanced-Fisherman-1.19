package net.youreahotfishy.advancedfisherman;

import net.fabricmc.api.ModInitializer;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.youreahotfishy.advancedfisherman.blocks.ModBlocks;
import net.youreahotfishy.advancedfisherman.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass implements ModInitializer {

	public static final String MOD_ID = "advancedfisherman";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Advanced Fisherman Mod Loaded.");
	}
}
