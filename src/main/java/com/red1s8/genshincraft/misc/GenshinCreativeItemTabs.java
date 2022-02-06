package com.red1s8.genshincraft.misc;

import com.red1s8.genshincraft.items.ItemsRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GenshinCreativeItemTabs {
    public static final CreativeModeTab GENSHIN_FOOD = new CreativeModeTab("genshinfood") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegister.RADISH_BALLS.get());
        }
    };

    public static final CreativeModeTab GENSHIN_BLOCKS_ORES = new CreativeModeTab("genshinblocks_ores") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegister.WHITE_IRON_CHUNK.get());
        }
    };

    public static final CreativeModeTab GENSHIN_WEAPON = new CreativeModeTab("genshin_weapon") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegister.DEBATE_CLUB.get());
        }
    };
}
