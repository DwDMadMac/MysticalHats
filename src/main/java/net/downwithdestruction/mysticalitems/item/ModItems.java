package net.downwithdestruction.mysticalitems.item;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.downwithdestruction.mysticalitems.item.tool.ItemAxe;
import net.downwithdestruction.mysticalitems.item.tool.ItemHoe;
import net.downwithdestruction.mysticalitems.item.tool.ItemPickaxe;
import net.downwithdestruction.mysticalitems.item.tool.ItemShovel;
import net.downwithdestruction.mysticalitems.item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by madmac on 7/1/2018.
 * <p>
 * This class will contain the instances of all our items, using our ItemBase help class.
 */
public class ModItems {

    // Create new in-game items (ItemBase), with respectively name and then sets which tab the items will go in (Materials Tab...)
    public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");
    public static ItemCorn corn = new ItemCorn();
    public static ItemCornSeed cornSeed = new ItemCornSeed();
    // Tools
    public static ItemSword copperSword = new ItemSword(MysticalItemsMod.copperToolMaterial, "copper_sword");
    public static ItemPickaxe copperPickaxe = new ItemPickaxe(MysticalItemsMod.copperToolMaterial, "copper_pickaxe");
    public static ItemAxe copperAxe = new ItemAxe(MysticalItemsMod.copperToolMaterial, "copper_axe");
    public static ItemShovel copperShovel = new ItemShovel(MysticalItemsMod.copperToolMaterial, "copper_shovel");
    public static ItemHoe copperHoe = new ItemHoe(MysticalItemsMod.copperToolMaterial, "copper_hoe");

    /**
     * Registers items with the GameRegistry
     *
     * @param registry Registers items with the GameRegistry
     */
    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                corn,
                cornSeed,
                copperSword,
                copperPickaxe,
                copperAxe,
                copperShovel,
                copperHoe
        );
    }

    /**
     * Applies registered items
     */
    public static void registerModels() {
        ingotCopper.registerItemModel();
        corn.registerItemModel();
        cornSeed.registerItemModel();
        copperSword.registerItemModel();
        copperPickaxe.registerItemModel();
        copperAxe.registryItemModel();
        copperShovel.registryItemModel();
        copperHoe.registryItemModel();
    }
}
