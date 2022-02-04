package com.red1s8.genshincraft.items.food;

import com.red1s8.genshincraft.GenshinCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodBase {
    public static final DeferredRegister<Item> FOOD = DeferredRegister.create(ForgeRegistries.ITEMS, GenshinCraft.MOD_ID);

    public static final RegistryObject<Item> RADISH = FOOD.register("radish", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> RADISH_BALLS = FOOD.register("radish_balls", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static void register(IEventBus eventBus){
        FOOD.register(eventBus);
    }
}
