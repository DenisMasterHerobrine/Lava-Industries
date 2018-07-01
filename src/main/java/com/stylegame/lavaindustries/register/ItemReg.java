package com.stylegame.lavaindustries.register;

import com.stylegame.lavaindustries.base.LavaCoal;
import com.stylegame.lavaindustries.food.FoodClass;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemReg {
      public static Item LavaCoal = new LavaCoal("lavacoal",64);
      public static Item LavaApple = new FoodClass(6, 10F, false, "LavaApple", Items.BONE);

  public static void register()
  {
      registerItems(LavaCoal);
      registerItems(LavaApple);
  }

  public static void registerRender()
  {
      registerItemsRender(LavaCoal);
      registerItemsRender(LavaApple);
  }

    private static void registerItems(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }
   private static void registerItemsRender(Item item) {
       Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}