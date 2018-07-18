package com.stylegame.lavaindustries.creativetabs;

import com.stylegame.lavaindustries.register.ItemReg;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

    public class TabLI extends CreativeTabs {
        public TabLI(String label) {
            super(label);
        }

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemReg.LavaCoal);
        }
    }