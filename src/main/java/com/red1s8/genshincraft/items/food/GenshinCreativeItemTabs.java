package com.red1s8.genshincraft.items.food;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GenshinCreativeItemTabs {
    public static final CreativeModeTab GENSHIN_FOOD = new CreativeModeTab("genshinfood") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoodBase.RADISH_BALLS.get());
        }
    };
}
