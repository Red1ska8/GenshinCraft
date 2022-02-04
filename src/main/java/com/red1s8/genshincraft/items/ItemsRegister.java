package com.red1s8.genshincraft.items;

import com.red1s8.genshincraft.GenshinCraft;
import com.red1s8.genshincraft.blocks.BlocksRegister;
import com.red1s8.genshincraft.misc.GenshinCreativeItemTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GenshinCraft.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> RADISH = ITEMS.register("radish",
            () -> new ItemNameBlockItem(BlocksRegister.RADISH_CROP.get(), new Item.Properties().tab(GenshinCreativeItemTabs.GENSHIN_FOOD)
                    .food(new FoodProperties.Builder().nutrition(2).fast().build())));
    public static final RegistryObject<Item> RADISH_BALLS = ITEMS.register("radish_balls",
            () -> new Item(new Item.Properties().tab(GenshinCreativeItemTabs.GENSHIN_FOOD)
                    .food(new FoodProperties.Builder().effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,200,0),1f).build())));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().tab(GenshinCreativeItemTabs.GENSHIN_FOOD)
                    .food(new FoodProperties.Builder().nutrition(1).build())));
    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper",
            () -> new Item(new Item.Properties().tab(GenshinCreativeItemTabs.GENSHIN_FOOD)
                    .food(new FoodProperties.Builder().nutrition(1).fast().build())));
}
