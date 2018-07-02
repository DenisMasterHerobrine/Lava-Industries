package com.stylegame.lavaindustries.base.tools;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

import static com.stylegame.lavaindustries.register.ItemReg.CoalniteMaterialPickaxe;

public class CoalnitePickaxe extends ItemPickaxe
{
    public CoalnitePickaxe(String name, Item.ToolMaterial material)
    {
        super(CoalniteMaterialPickaxe);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
    }
}
