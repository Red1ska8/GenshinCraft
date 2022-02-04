package com.red1s8.genshincraft.blocks.crops;

import com.red1s8.genshincraft.items.ItemsBase;
import net.minecraft.util.Mth;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class RadishCrop extends CropBlock {
    private static final IntegerProperty NEW_AGE = BlockStateProperties.AGE_3;

    public RadishCrop(Properties properties) {
        super(properties);
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return NEW_AGE;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(NEW_AGE);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ItemsBase.RADISH.get();
    }

    @Override
    protected int getBonemealAgeIncrease(Level pLevel)  {
        return Mth.nextInt(pLevel.random, 1, 2);
    }
}
