package com.stylegame.lavaindustries.baseores;

import com.stylegame.lavaindustries.LavaIndustries;
import com.stylegame.lavaindustries.items.ItemReg;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class LavaCoalOreParams extends Block {
    public Item drop;
    public int valueDrops;
    public int meta;

    public LavaCoalOreParams(Material MaterialBlock, String NameRegistry, String NameLocalized, String ToolClass, int ToolLevel, float Resistance, float Hardness) {

        super(MaterialBlock);

        this.setUnlocalizedName(NameRegistry);
        this.setRegistryName(NameLocalized);
        this.setHarvestLevel(ToolClass, ToolLevel);
        this.setResistance(Resistance);
        this.setHardness(Hardness);
        this.setCreativeTab(LavaIndustries.tabLI);
        this.drop = ItemReg.LavaCoal;
        this.meta = meta;
        this.valueDrops = 1;
    }
    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        drops.clear();
        ItemStack stack = new ItemStack(drop, valueDrops + RANDOM.nextInt(1), meta);
        if (!stack.isEmpty()) drops.add(stack);
    }
}