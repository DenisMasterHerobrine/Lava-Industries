package com.stylegame.lavaindustries.base.tools;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

import static com.stylegame.lavaindustries.register.ItemReg.CoalniteMaterialShovel;

public class CoalniteShovel extends ItemSpade
{
    public CoalniteShovel(String name, Item.ToolMaterial material)
    {
        super(CoalniteMaterialShovel);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
    }
}
