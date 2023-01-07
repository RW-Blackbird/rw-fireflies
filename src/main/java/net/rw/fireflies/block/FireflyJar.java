package net.rw.fireflies;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;

import javax.swing.text.html.BlockView;

public class FireflyJar extends Block {

    public FireflyJar(Settings settings) {
        super(settings);
    }

    private static VoxelShape SHAPE = Block.createCuboidShape(5,0,5,11,7,11);

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
        return SHAPE;
    }
}
