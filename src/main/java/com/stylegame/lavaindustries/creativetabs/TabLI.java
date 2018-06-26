package com.stylegame.lavaindustries.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

    public class TabLI extends CreativeTabs {
        public TabLI(String label) {
            super(label);
        }

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.COAL);
        }
    }