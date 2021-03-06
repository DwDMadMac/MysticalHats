package net.downwithdestruction.mysticalitems.item.tool;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.minecraft.item.ItemSpade;

public class ItemShovel extends ItemSpade {
    private String name;

    /**
     * setup constructor with name variable
     *
     * @param material set the material for the tool
     * @param name     set the name for the tool
     */
    public ItemShovel(ToolMaterial material, String name) {
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
