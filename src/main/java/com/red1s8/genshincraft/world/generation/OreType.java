package com.red1s8.genshincraft.world.generation;


import com.red1s8.genshincraft.blocks.BlocksRegister;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    WHITE_IRON_ORE(Lazy.of(BlocksRegister.WHITE_IRON_ORE), Lazy.of(BlocksRegister.WHITE_IRON_ORE_DEEPSLATE),6,-32,32,4);

    private final Lazy<Block> block;
    private final Lazy<Block> block_deepslate;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.block_deepslate = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    OreType(Lazy<Block> block, Lazy<Block> deepslate_block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.block_deepslate = deepslate_block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public Lazy<Block> getBlock_deepslate() {
        return block_deepslate;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public static OreType get(Block block){
        for (OreType ore : values()){
            if(block.equals(ore.block)){
                return ore;
            }
        }
        return null;
    }
}
