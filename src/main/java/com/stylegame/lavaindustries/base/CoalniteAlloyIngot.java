package com.stylegame.lavaindustries.base;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.item.Item;

public class CoalniteAlloyIngot extends Item {
    public CoalniteAlloyIngot(String name, int maxStackSize){
        this.setRegistryName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(maxStackSize);
    }
}

