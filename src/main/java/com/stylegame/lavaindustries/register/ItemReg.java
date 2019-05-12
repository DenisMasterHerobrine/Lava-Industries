package com.stylegame.lavaindustries.register;

import com.stylegame.lavaindustries.base.*;
import com.stylegame.lavaindustries.base.armor.ItemLavaArmor;
import com.stylegame.lavaindustries.base.tools.CoalnitePickaxe;
import com.stylegame.lavaindustries.base.tools.CoalniteShovel;
import com.stylegame.lavaindustries.base.tools.CoalniteAxe;
import com.stylegame.lavaindustries.base.tools.CoalniteSword;
import com.stylegame.lavaindustries.food.FoodClass;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import static com.stylegame.lavaindustries.base.armor.ItemLavaArmor.LAVAINGOT_ARMOR;

public class ItemReg {
      public static Item LavaCoal = new LavaCoal("lavacoal",64);
      public static Item LavaIngot = new LavaIngot("lavaingot",64);
      public static Item CoalniteAlloyChunk = new CoalniteAlloyChunk("CoalniteAlloyChunk",64);
      public static Item CoalniteAlloyIngot = new CoalniteAlloyIngot("CoalniteAlloyIngot",64);
      public static Item CoalniteAlloyRod = new CoalniteAlloyRod("CoalniteAlloyRod",64);
      public static Item LavaApple = new FoodClass(7, 25F, false, "LavaApple", Items.BONE);
      public static Item LavaInfusedDiamond = new LavaInfusedDiamond("lavainfuseddiamond",64);
      public static Item.ToolMaterial CoalniteMaterialSword = EnumHelper.addToolMaterial("lavaindustries:coalnitesword", 0, 1200, 5.0F, 10.0F, 12);
      public static Item.ToolMaterial CoalniteMaterialAxe = EnumHelper.addToolMaterial("lavaindustries:coalniteaxe", 1, 1200, 25.0F, 12.0F, 12);
      public static Item.ToolMaterial CoalniteMaterialPickaxe = EnumHelper.addToolMaterial("lavaindustries:coalnitepickaxe", 3, 1200, 15.0F, 7.0F, 12);
      public static Item.ToolMaterial CoalniteMaterialShovel = EnumHelper.addToolMaterial("lavaindustries:coalniteshovel", 1, 1200, 15.0F, 6.0F, 12);

      public static ItemPickaxe CoalnitePickaxe = new CoalnitePickaxe("coalnitepickaxe", CoalniteMaterialPickaxe);
      public static ItemAxe CoalniteAxe = new CoalniteAxe("coalniteaxe", CoalniteMaterialAxe);
      public static ItemSpade CoalniteShovel = new CoalniteShovel("coalniteshovel", CoalniteMaterialShovel);
      public static ItemSword CoalniteSword = new CoalniteSword("coalnitesword", CoalniteMaterialSword);

      public static Item
            BOOTS = new ItemLavaArmor("boots",LAVAINGOT_ARMOR, 1, EntityEquipmentSlot.FEET),
            LEGS = new ItemLavaArmor("legs", LAVAINGOT_ARMOR, 2, EntityEquipmentSlot.LEGS),
            CHESTPLATE = new ItemLavaArmor("chestplate", LAVAINGOT_ARMOR, 1, EntityEquipmentSlot.CHEST),
            HEAD = new ItemLavaArmor("helmet", LAVAINGOT_ARMOR, 1, EntityEquipmentSlot.HEAD);


  public static void register()
  {
      registerItems(LavaCoal);
      registerItems(LavaIngot);
      registerItems(LavaApple);
      registerItems(CoalniteAlloyChunk);
      registerItems(CoalniteAlloyIngot);
      registerItems(CoalniteAlloyRod);
      registerItems(CoalnitePickaxe);
      registerItems(CoalniteAxe);
      registerItems(CoalniteShovel);
      registerItems(CoalniteSword);
      registerItems(LavaInfusedDiamond);

      registerItems(BOOTS);
      registerItems(LEGS);
      registerItems(CHESTPLATE);
      registerItems(HEAD);
  }

  public static void registerRender()
  {
      registerItemsRender(LavaCoal);
      registerItemsRender(LavaIngot);
      registerItemsRender(LavaApple);
      registerItemsRender(CoalniteAlloyChunk);
      registerItemsRender(CoalniteAlloyIngot);
      registerItemsRender(CoalniteAlloyRod);
      registerItemsRender(CoalnitePickaxe);
      registerItemsRender(CoalniteAxe);
      registerItemsRender(CoalniteShovel);
      registerItemsRender(CoalniteSword);
      registerItemsRender(LavaInfusedDiamond);

      registerItemsRender(BOOTS);
      registerItemsRender(LEGS);
      registerItemsRender(CHESTPLATE);
      registerItemsRender(HEAD);
  }

    private static void registerItems(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }

    private static void registerItemsRender(Item item) {
       Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}