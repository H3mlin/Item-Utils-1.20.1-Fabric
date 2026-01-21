package com.h3mlin.itemutils.item;

import com.h3mlin.itemutils.CCItemUtils;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CCItemUtils.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CCItemUtils.LOGGER.info(CCItemUtils.MOD_ID + ": Registering mod items");
    }
}
