package com.red1s8.genshincraft.blocks;

import com.red1s8.genshincraft.GenshinCraft;
import com.red1s8.genshincraft.blocks.crops.RadishCrop;
import com.red1s8.genshincraft.items.ItemsRegister;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlocksRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GenshinCraft.MOD_ID);

    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ItemsRegister.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    public static final RegistryObject<Block> RADISH_CROP = BLOCKS.register("radish_crop",
            () -> new RadishCrop(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> WHITE_IRON_ORE = registerBlock("white_iron_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(10f).requiresCorrectToolForDrops()));
}
