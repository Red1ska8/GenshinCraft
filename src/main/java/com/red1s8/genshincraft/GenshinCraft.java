package com.red1s8.genshincraft;

import com.red1s8.genshincraft.blocks.BlocksRegister;
import com.red1s8.genshincraft.items.ItemsRegister;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GenshinCraft.MOD_ID)
public class GenshinCraft
{
    public static final String MOD_ID = "genshincraft";
    private static final Logger LOGGER = LogManager.getLogger();

    public GenshinCraft() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemsRegister.register(eventBus);
        BlocksRegister.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::setupClient);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupClient(final FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(BlocksRegister.RADISH_CROP.get(), RenderType.cutout());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
