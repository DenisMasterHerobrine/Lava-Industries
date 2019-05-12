package com.stylegame.lavaindustries.base;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LavaCoalBlock extends Block {
    public LavaCoalBlock(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
    }
}
