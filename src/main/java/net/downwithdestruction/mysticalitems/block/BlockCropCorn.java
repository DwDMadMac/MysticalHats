package net.downwithdestruction.mysticalitems.block;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.downwithdestruction.mysticalitems.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by madmac on 7/1/2018.
 */
public class BlockCropCorn extends BlockCrops {

    public BlockCropCorn() {
        setUnlocalizedName("crop_corn");
        setRegistryName("crop_corn");
        // Needed because BlockCropCorn does not extend to both base item/block classes
        setCreativeTab(MysticalItemsMod.creativeTab);
    }

    /**
     * Determine what to drop when the crop block is broken.
     * Seed
     *
     * @return drop seeds when crop block is broken
     */
    @Override
    protected Item getSeed() {
        return ModItems.cornSeed;
    }

    /**
     * Determine what to drop when the crop block is broken.
     * Crop
     *
     * @return drop crops when crop block is broken
     */
    @Override
    protected Item getCrop() {
        return ModItems.corn;
    }
}
