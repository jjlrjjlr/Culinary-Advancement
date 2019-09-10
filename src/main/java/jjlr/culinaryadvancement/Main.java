package jjlr.culinaryadvancement;

import net.fabricmc.api.ModInitializer;
import jjlr.culinaryadvancement.items.*;

public class Main implements ModInitializer {

	public static String MODID = "culinaryadvancement";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");

		IngredientItems.registerItems();
	}
}
