package com.red1s8.genshincraft.items.food;

import com.red1s8.genshincraft.GenshinCraft;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class FoodBase extends Item{
    public static final DeferredRegister<Item> FOOD = DeferredRegister.create(ForgeRegistries.ITEMS, GenshinCraft.MOD_ID);

    public static final RegistryObject<Item> RADISH = FOOD.register("radish",
            () -> new Item(new Item.Properties().tab(GenshinCreativeItemTabs.GENSHIN_FOOD)
                    .food(new FoodProperties.Builder().nutrition(2).fast().build())));
    public static final RegistryObject<Item> RADISH_BALLS = FOOD.register("radish_balls",
            () -> new Item(new Item.Properties().tab(GenshinCreativeItemTabs.GENSHIN_FOOD)
                    .food(new FoodProperties.Builder().effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,200,0),1f).build())));
    public static final RegistryObject<Item> FLOUR = FOOD.register("flour",
            () -> new Item(new Item.Properties().tab(GenshinCreativeItemTabs.GENSHIN_FOOD)
                    .food(new FoodProperties.Builder().nutrition(1).build())));
    public static final RegistryObject<Item> PEPPER = FOOD.register("pepper",
            () -> new Item(new Item.Properties().tab(GenshinCreativeItemTabs.GENSHIN_FOOD)
                    .food(new FoodProperties.Builder().nutrition(1).fast().build())));


    public FoodBase(Properties pProperties) {
        super(pProperties);
    }

    public static void register(IEventBus eventBus){
        FOOD.register(eventBus);
    }
}
