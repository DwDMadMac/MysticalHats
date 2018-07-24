package net.downwithdestruction.mysticalitems.item.tool;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;

public class ItemHoe extends net.minecraft.item.ItemHoe {
    private String name;

    /**
     * setup constructor with name variable
     *
     * @param material set material for tool
     * @param name     set name for the tool
     */
    public ItemHoe(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MysticalItemsMod.creativeTab);
        this.name = name;
    }

    /**
     * Register 'name' to our item model
     */
    public void registryItemModel(){
        MysticalItemsMod.proxy.registerItemRenderer(this,0,name);
    }
}
