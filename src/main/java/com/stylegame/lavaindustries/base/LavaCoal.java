package com.stylegame.lavaindustries.base;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.item.Item;

public class LavaCoal extends Item{
  public LavaCoal(String name, int maxStackSize){
      this.setRegistryName(name);
      this.setCreativeTab(LavaIndustries.tabLI);
      this.setUnlocalizedName(name);
      this.setMaxStackSize(maxStackSize);
  }
}