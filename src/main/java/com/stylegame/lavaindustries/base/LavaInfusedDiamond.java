package com.stylegame.lavaindustries.base;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.item.Item;

public class LavaInfusedDiamond extends Item {
    public LavaInfusedDiamond(String name, int maxStackSize){
        this.setRegistryName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(maxStackSize);
    }
}