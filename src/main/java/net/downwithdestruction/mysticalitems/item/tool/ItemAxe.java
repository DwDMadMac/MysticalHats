package net.downwithdestruction.mysticalitems.item.tool;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;

public class ItemAxe extends net.minecraft.item.ItemAxe {

    private String name;

    /**
     * Uses constructor with only ToolMaterial to avoid 'ArrayIndexOutOfBoundsException' because of hardcoded values in the float arrays in ItemAxe class.
     *
     * @param material sets the material, the damage and attack speed to tool
     * @param name     sets the name for the tool
     */
    public ItemAxe(ToolMaterial material, String name) {
        super(material, 8f, -3.1f);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.name = name;
    }

    /**
     * Register 'name' to our item model
     */
    public void registryItemModel(){
        MysticalItemsMod.proxy.registerItemRenderer(this,0, name);
    }
}
