package net.downwithdestruction.mysticalitems.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by madmac on 7/1/2018.
 */
public class ModBlocks {

    // Create a new BlockOre with the name "ore_copper". Then sets which tab the items will go in (Materials Tab)
    public static BlockOre oreCopper = new BlockOre("ore_copper", "oreCopper");
    // Initialize BlockCropCorn Variable
    public static BlockCropCorn cropCorn = new BlockCropCorn();
    public static BlockPedestal pedestal = new BlockPedestal();

    /**
     * Registers the block itself with the block registry.
     *
     * @param registry Registers the block itself with the block registry.
     */
    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                cropCorn,
                pedestal
        );
    }

    /**
     * Registers the ItemBlock with the item registry.
     *
     * @param registry Registers the ItemBlock with the item registry
     */
    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock(),
                pedestal.createItemBlock()
        );
    }

    /**
     * Registers the item model.
     */
    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        pedestal.registerItemModel(Item.getItemFromBlock(pedestal));
    }
}
