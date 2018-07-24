package net.downwithdestruction.mysticalitems.item.tool;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;

public class ItemSword extends net.minecraft.item.ItemSword {

    private String name;

    /**
     * Setup constructor with name variable
     *
     * @param material sets the material to tool
     * @param name     sets the name for the tool
     */
    public ItemSword(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.name = name;
        setCreativeTab(MysticalItemsMod.creativeTab);
    }

    /**
     * Register 'name' to our item model
     */
    public void registerItemModel() {
        MysticalItemsMod.proxy.registerItemRenderer(this, 0, name);
    }
}
