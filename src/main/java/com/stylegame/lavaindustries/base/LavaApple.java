package com.stylegame.lavaindustries.base;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.item.Item;

public class LavaApple extends Item {
        public LavaApple(String name, int maxStackSize){
            this.setRegistryName(name);
            this.setCreativeTab(LavaIndustries.tabLI);
            this.setUnlocalizedName(name);
            this.setMaxStackSize(maxStackSize);
        }
    }
