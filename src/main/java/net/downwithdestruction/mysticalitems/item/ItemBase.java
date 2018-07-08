package net.downwithdestruction.mysticalitems.item;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by madmac on 7/1/2018.
 * <p>
 * Helper Class.
 */
public class ItemBase extends Item {
    protected String name;

    /**
     * ItemBase class will make it simpler to add basic items quickly.
     * setUnlocalizedName() is used for translating the name of the items into the currently active language.
     * setRegistryName() is used when registering our items with Forge and should never, ever change.
     * setCreativeTab() is used for creative a new tab in creative mode menu
     *
     * @param name returns the name of the given item
     */
    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MysticalItemsMod.creativeTab);
    }

    public void registerItemModel() {
        MysticalItemsMod.proxy.registerItemRenderer(this, 0, name);
    }

    /**
     * setCreativeTab method is an overridden version that returns ItemBase
     * instead of Item so we can use it in our register method without casting.
     *
     * @param tab Prepare to set a custom creative tab
     * @return ItemBase instead of item
     */
    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
