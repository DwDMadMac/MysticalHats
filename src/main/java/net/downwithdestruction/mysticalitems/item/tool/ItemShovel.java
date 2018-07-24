package net.downwithdestruction.mysticalitems.item.tool;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.minecraft.item.ItemSpade;

public class ItemShovel extends ItemSpade {
    private String name;

    public ItemShovel(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.name = name;
    }

    public void registryItemModel(){
        MysticalItemsMod.proxy.registerItemRenderer(this,0,name);
    }
}
