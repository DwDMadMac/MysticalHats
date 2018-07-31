package net.downwithdestruction.mysticalitems.item;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemArmor extends net.minecraft.item.ItemArmor {
    private String name;

    public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material,0,slot);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MysticalItemsMod.creativeTab);
        this.name = name;
    }

    public void registryItemModel(){
        MysticalItemsMod.proxy.registerItemRenderer(this,0,name);
    }

}
