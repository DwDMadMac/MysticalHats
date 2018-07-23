package net.downwithdestruction.mysticalitems.item;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
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
    public static ItemSword copperSword = new ItemSword(MysticalItemsMod.copperToolMaterial, "copper_sword");

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
                copperSword
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
    }
}
