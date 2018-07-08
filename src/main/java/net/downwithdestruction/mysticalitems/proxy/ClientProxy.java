package net.downwithdestruction.mysticalitems.proxy;

import net.downwithdestruction.mysticalitems.MysticalItemsMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by madmac on 7/1/2018.
 * <p>
 * Access only client classes
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        // Tell Minecraft which items model to use for our items
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(MysticalItemsMod.modId + ":" + id, "inventory"));
    }
}
