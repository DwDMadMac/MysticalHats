package net.downwithdestruction.mysticalitems.recipe;

import net.downwithdestruction.mysticalitems.block.ModBlocks;
import net.downwithdestruction.mysticalitems.item.ModItems;

public class ModRecipes {

    public static void init() {
        //Ore Dict
        ModBlocks.oreCopper.initOreDict();
        ModItems.ingotCopper.initOreDict();
        ModItems.corn.initOreDict();
    }

}
