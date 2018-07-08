package net.downwithdestruction.mysticalitems.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockPedestal extends BlockBase {

    public BlockPedestal() {
        super(Material.ROCK, "pedestal");
    }

    /**
     * Determines if the block should cull faces of the adjacent block.
     * ** Allows the blocks behind to be seen
     * ** Use if you are not using the full minecraft cube (1m^3)
     *
     * @param state the STATE of the given block
     * @return the state of the given block
     */
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    /**
     * Determines if light should pass through the block.
     * ** Allows light to pass through the block (cube)
     * ** Use if you are not using the full minecraft cube (1m^3)
     *
     * @param state the STATE of the given block
     * @return the state of the given block
     */
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
