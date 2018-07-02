package com.stylegame.lavaindustries.base;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CoalniteAlloyChunk extends Item {
    public CoalniteAlloyChunk(String name, int maxStackSize){
        this.setRegistryName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(maxStackSize);
    }
}

