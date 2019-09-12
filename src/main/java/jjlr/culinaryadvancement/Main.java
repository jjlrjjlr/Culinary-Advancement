package jjlr.culinaryadvancement;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jjlr.culinaryadvancement.items.*;

public class Main implements ModInitializer {

	public static final String MODID = "culinaryadvancement";
	public static final String VERSION = "0.1.0";
	public static final Logger logger = LogManager.getLogger("culinaryadvancementlogger");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		logger.info("Culinary advancement version {} started with modid {}.", VERSION, MODID);

		

		IngredientItems.registerItems();
		CraftedFood.registerItems();
	}


}
