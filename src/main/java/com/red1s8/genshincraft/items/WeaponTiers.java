package com.red1s8.genshincraft.items;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class WeaponTiers {
    public static final ForgeTier T1_CLAYMORES = new ForgeTier(2,1200, 3.0F,3.0F,15,
            Tags.Blocks.NEEDS_GOLD_TOOL,() -> Ingredient.of(ItemsRegister.WHITE_IRON_CHUNK.get()));
}
