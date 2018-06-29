package com.stylegame.lavaindustries.baseores;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

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