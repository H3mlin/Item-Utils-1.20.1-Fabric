package com.h3mlin.itemutils.util;

import com.h3mlin.itemutils.CCItemUtils;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        //public static final TagKey<Block> BLOCK_TAG_NAME = createTag("block_tag_name");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(CCItemUtils.MOD_ID, name));
        }
    }

    public static class Items {
        //public static final TagKey<Item> ITEM_TAG_NAME = createTag("item_tag_name");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(CCItemUtils.MOD_ID, name));
        }
    }
}
