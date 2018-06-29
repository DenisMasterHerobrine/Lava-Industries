package com.stylegame.lavaindustries.crafts;

import com.stylegame.lavaindustries.BlocksRegister;
import com.stylegame.lavaindustries.items.ItemReg;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftRegister {

    public static void recipesRegister() {
        GameRegistry.addShapedRecipe(new ResourceLocation("rope"), new ResourceLocation("rope"), new ItemStack(BlocksRegister.MachineCase), new Object[]{
                "NCN",
                "RIR",
                "NGN",
                'C', ItemReg.LavaCoal,
                'R', Items.REDSTONE,
                'G', Items.GOLD_INGOT,
                'I', Blocks.IRON_BLOCK,
                'N', Items.NETHERBRICK
        });
    }
}