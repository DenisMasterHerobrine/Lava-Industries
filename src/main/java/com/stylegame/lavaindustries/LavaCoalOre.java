package com.stylegame.lavaindustries;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class LavaCoalOre extends Block
{
    public LavaCoalOre(String lava_coal_ore)
    {
        super(Material.ROCK);
        this.setRegistryName(lava_coal_ore);
        this.setUnlocalizedName(lava_coal_ore);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
}

