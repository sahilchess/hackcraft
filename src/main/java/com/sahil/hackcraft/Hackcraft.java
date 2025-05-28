package com.sahil.hackcraft;

import com.sahil.hackcraft.block.ModBlocks;
import com.sahil.hackcraft.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import com.sahil.hackcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hackcraft implements ModInitializer {
	public static final String MOD_ID = "hackcraft";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}


