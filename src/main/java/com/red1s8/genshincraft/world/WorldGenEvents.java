package com.red1s8.genshincraft.world;

import com.red1s8.genshincraft.GenshinCraft;
import com.red1s8.genshincraft.world.generation.OreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GenshinCraft.MOD_ID)
public class WorldGenEvents {
    @SubscribeEvent
    public static void WorldGen(final BiomeLoadingEvent event){
        OreGeneration.generateOres(event);
    }
}
