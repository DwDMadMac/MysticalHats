package net.downwithdestruction.mysticalitems;

import net.downwithdestruction.mysticalitems.block.ModBlocks;
import net.downwithdestruction.mysticalitems.client.MysticalHatsTab;
import net.downwithdestruction.mysticalitems.item.ModItems;
import net.downwithdestruction.mysticalitems.proxy.CommonProxy;
import net.downwithdestruction.mysticalitems.world.ModWorldGen;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by madmac on 7/1/2018.
 */
@Mod(modid = MysticalItemsMod.modId, name = MysticalItemsMod.name, version = MysticalItemsMod.version, acceptedMinecraftVersions = "[1.12.2]")
public class MysticalItemsMod {

    public static final String modId = "mysticalitems";
    public static final String name = "Mystical Items";
    public static final String version = "0.0.2";

    @Mod.Instance(modId)
    public static MysticalItemsMod instance;

    @SidedProxy(serverSide = "net.downwithdestruction.mysticalitems.proxy.CommonProxy", clientSide = "net.downwithdestruction.mysticalitems.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final MysticalHatsTab creativeTab = new MysticalHatsTab();
    // Tool Material
    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);
    // Armor Material
    public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", modId + ":copper",15,new int[]{2,5,6,2},9,SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0F);

    @Mod.EventHandler
    public void preRun(FMLPreInitializationEvent event) {
        System.out.println(name + " is now starting!");
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3); // Register world generator
    }

    /**
     * Static inner class
     *
     * Handles the registration.
     *
     * Mod.EventBusSubscriber annotation signals Forge that it needs to be subscribed to the main event bus
     *
     * The event bus is Forge’s system for allowing mods to register (or subscribe) handler methods to be run when specific events happen.
     *
     * Registry Events:
     * Registries are Forge’s method of keeping track of all the objects of various types in the game,-
     * both vanilla Minecraft and modded ones.
     */
    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        // Event Handler for Firing at the appropriate time for registering objects w/ Forge
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        // Event handler for firing at the appropriate time for models to be registered
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

        // Event Handler for firing at the appropriate time for registering blocks
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }
    }

    @Mod.EventHandler
    public void run(FMLInitializationEvent event) {
        System.out.println(name + " is now running.");
    }

    @Mod.EventHandler
    public void postRun(FMLPostInitializationEvent event) {
        System.out.println(name + " is shutting down!");
    }
}
