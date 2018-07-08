package net.downwithdestruction.mysticalitems.item;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCorn extends ItemFood {

    public ItemCorn() {
        super(3, 0.6f, false);
        setUnlocalizedName("corn");
        setRegistryName("corn");
        setCreativeTab(MysticalItemsMod.creativeTab);
    }

    public void registerItemModel() {
        MysticalItemsMod.proxy.registerItemRenderer(this, 0, "corn");
    }

    public void initOreDict() {
        OreDictionary.registerOre("cropCorn", this);
    }
}
