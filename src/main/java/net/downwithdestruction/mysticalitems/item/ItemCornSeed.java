package net.downwithdestruction.mysticalitems.item;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.downwithdestruction.mysticalitems.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

/**
 * Created by madmac on 7/1/2018.
 * <p>
 * implements ItemModelProvider
 */
public class ItemCornSeed extends ItemSeeds {

    public ItemCornSeed() {
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("corn_seed");
        setRegistryName("corn_seed");
        // Needed because ItemCornSeed does not extend to both base item/block classes
        setCreativeTab(MysticalItemsMod.creativeTab);
    }

    public void registerItemModel() {
        MysticalItemsMod.proxy.registerItemRenderer(this, 0, "corn_seed");
    }
}
