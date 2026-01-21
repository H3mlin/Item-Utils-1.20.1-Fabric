package com.h3mlin.itemutils;

import com.h3mlin.itemutils.block.ModBlocks;
import com.h3mlin.itemutils.block.enity.ModBlockEntities;
import com.h3mlin.itemutils.block.peripheral.ModBlockPeripherals;
import com.h3mlin.itemutils.item.ModItemGroups;
import com.h3mlin.itemutils.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CCItemUtils implements ModInitializer {
	public static final String MOD_ID = "itemutils";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();

        ModBlocks.registerModBlocks();
        ModBlockEntities.registerBlockEntities();
        ModBlockPeripherals.registerBlockPeripherals();

        ModItemGroups.registerItemGroups();

	}
}