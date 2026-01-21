package com.h3mlin.itemutils.block.peripheral;

import com.h3mlin.itemutils.CCItemUtils;
import com.h3mlin.itemutils.block.enity.ModBlockEntities;
import dan200.computercraft.api.peripheral.PeripheralLookup;

public class ModBlockPeripherals {
    public static void registerBlockPeripherals() {
        PeripheralLookup.get().registerForBlockEntity((a, b) -> new ItemExtractorPeripheral(a), ModBlockEntities.ITEM_EXTRACTOR_ENTITY);

        CCItemUtils.LOGGER.info(CCItemUtils.MOD_ID + ": Registering block peripherals");
    }
}
