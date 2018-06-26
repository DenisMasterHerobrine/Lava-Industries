package com.stylegame.lavaindustries.items;

import com.stylegame.lavaindustries.base.LavaCoal;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemReg {
      public static Item LavaCoal = new LavaCoal("lavacoal",64);

  public static void register()
  {
      registerItems(LavaCoal);
  }

  public static void registerRender()
  {
      registerItemsRender(LavaCoal);
  }

    private static void registerItems(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }
   private static void registerItemsRender(Item item) {
       Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}