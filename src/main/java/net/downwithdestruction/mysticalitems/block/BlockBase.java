package net.downwithdestruction.mysticalitems.block;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by madmac on 7/1/2018.
 */
public class BlockBase extends Block {

    protected String name;

    /**
     * BlockBase constructor
     *
     * @param material grabs the base MATERIAL from the block
     * @param name     sets the NAME for the block
     */
    public BlockBase(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MysticalItemsMod.creativeTab);
    }

    /**
     * Setup model registration with proxy
     *
     * @param itemBlock register specified block
     */
    public void registerItemModel(Item itemBlock) {
        MysticalItemsMod.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    /**
     * Creates custom item block
     *
     * @return custom new block with its name
     */
    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }


    /**
     * Prepare to set a custom creative tab
     *
     * @param tab Prepare to set a custom creative tab
     * @return custom creative tab
     */
    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
