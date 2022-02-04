package com.red1s8.genshincraft.blocks;

import com.red1s8.genshincraft.GenshinCraft;
import com.red1s8.genshincraft.blocks.crops.RadishCrop;
import com.red1s8.genshincraft.items.ItemsBase;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlocksBase {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GenshinCraft.MOD_ID);

    protected <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    protected <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ItemsBase.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    public static final RegistryObject<Block> RADISH_CROP = BLOCKS.register("radish_crop",
            () -> new RadishCrop(BlockBehaviour.Properties.copy(Blocks.CARROTS)));
}
