package com.stylegame.lavaindustries.base.tools;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

import static com.stylegame.lavaindustries.register.ItemReg.CoalniteMaterialAxe;

public class CoalniteAxe extends ItemAxe
{
    public CoalniteAxe(String name, Item.ToolMaterial material)
    {
        super(CoalniteMaterialAxe, 1, 0);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
    }

}