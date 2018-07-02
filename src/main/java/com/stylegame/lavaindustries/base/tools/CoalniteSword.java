package com.stylegame.lavaindustries.base.tools;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import static com.stylegame.lavaindustries.register.ItemReg.CoalniteMaterialSword;

public class CoalniteSword extends ItemSword
{
    public CoalniteSword(String name, Item.ToolMaterial material)
    {
        super(CoalniteMaterialSword);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
    }
}