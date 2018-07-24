package net.downwithdestruction.mysticalitems.item.tool;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe {

    private String name;

    public ItemPickaxe(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.name = name;
        setCreativeTab(MysticalItemsMod.creativeTab);
    }

    public void registerItemModel(){
        MysticalItemsMod.proxy.registerItemRenderer(this,0,name);
    }
}
