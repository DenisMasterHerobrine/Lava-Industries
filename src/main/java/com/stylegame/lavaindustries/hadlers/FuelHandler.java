package com.stylegame.lavaindustries.hadlers;

import com.stylegame.lavaindustries.register.BlocksRegister;
import com.stylegame.lavaindustries.register.ItemReg;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        Item fuelItem = fuel.getItem();
        if (fuelItem == ItemReg.LavaCoal) {
            return 19200;
        } else if (fuelItem == Item.getItemFromBlock(BlocksRegister.LavaCoalBlock)) {
            return 192000;
        }
        return 0;
    }
}
