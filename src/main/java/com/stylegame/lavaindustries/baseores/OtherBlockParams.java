package com.stylegame.lavaindustries.baseores;

import com.stylegame.lavaindustries.LavaIndustries;
import com.stylegame.lavaindustries.items.ItemReg;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class OtherBlockParams extends Block {

    public OtherBlockParams(Material MaterialBlock, String NameRegistry, String NameLocalized, String ToolClass, int ToolLevel, float Resistance, float Hardness) {

        super(MaterialBlock);

        this.setUnlocalizedName(NameRegistry);
        this.setRegistryName(NameLocalized);
        this.setHarvestLevel(ToolClass, ToolLevel);
        this.setResistance(Resistance);
        this.setHardness(Hardness);
        this.setCreativeTab(LavaIndustries.tabLI);
    }
}