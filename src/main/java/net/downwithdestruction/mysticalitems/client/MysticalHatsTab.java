package net.downwithdestruction.mysticalitems.client;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.downwithdestruction.mysticalitems.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by madmac on 7/1/2018.
 */
public class MysticalHatsTab extends CreativeTabs {

    public MysticalHatsTab() {
        super(MysticalItemsMod.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotCopper);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
