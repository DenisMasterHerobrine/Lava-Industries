package com.stylegame.lavaindustries.food;

import com.stylegame.lavaindustries.LavaIndustries;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class FoodClass extends ItemFood {
    public Item item;
    public FoodClass(int amount, float saturation, boolean isWolfFood,String name,Item item) {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
        this.setUnlocalizedName(name);
        this.item = item;
    }
    @Override
    public void onFoodEaten(ItemStack is, World worldIn, EntityPlayer player) {
        ItemStack ItemFood = new ItemStack(item);
        if (!player.capabilities.isCreativeMode) player.getHeldItem(EnumHand.MAIN_HAND).shrink(1);
        if (!player.inventory.addItemStackToInventory(ItemFood))
            player.dropItem(ItemFood, false);
        return;
    }
}