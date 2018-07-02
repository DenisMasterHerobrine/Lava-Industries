package com.stylegame.lavaindustries.crafts;

import com.stylegame.lavaindustries.register.BlocksRegister;
import com.stylegame.lavaindustries.register.ItemReg;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftRegister {

    public static void recipesRegister() {
        GameRegistry.addShapedRecipe(new ResourceLocation("machinecase"), new ResourceLocation("machinecase"), new ItemStack(BlocksRegister.MachineCase), new Object[]{
                "NCN",
                "RIR",
                "NGN",
                'C', ItemReg.LavaCoal,
                'R', Items.REDSTONE,
                'G', Items.GOLD_INGOT,
                'I', Blocks.IRON_BLOCK,
                'N', Items.NETHERBRICK
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("lavaapple"), new ResourceLocation("lavaapple"), new ItemStack(ItemReg.LavaApple), new Object[]{
                " C ",
                " A ",
                " N ",
                'C', ItemReg.LavaCoal,
                'A', Items.GOLDEN_APPLE,
                'N', Items.NETHERBRICK
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("lavacoalblock"), new ResourceLocation("lavacoalblock"), new ItemStack(BlocksRegister.LavaCoalBlock), new Object[]{
                "CCC",
                "CCC",
                "CCC",
                'C', ItemReg.LavaCoal,
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("coalnitealloychunk"), new ResourceLocation("coalnitealloychunk"), new ItemStack(ItemReg.CoalniteAlloyChunk), new Object[]{
                " C ",
                "XIN",
                " R ",
                'C', ItemReg.LavaCoal,
                'X', Items.COAL,
                'I', Items.IRON_INGOT,
                'N', Items.NETHERBRICK,
                'R', Items.LAVA_BUCKET
        });

        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ItemReg.CoalniteAlloyChunk, 1), new ItemStack(ItemReg.CoalniteAlloyIngot, 1), 0.35f);

        GameRegistry.addShapedRecipe(new ResourceLocation("coalnitealloyrod"), new ResourceLocation("coalnitealloyrod"), new ItemStack(ItemReg.CoalniteAlloyRod), new Object[]{
                " C ",
                " C ",
                " C ",
                'C', ItemReg.CoalniteAlloyIngot,
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("coalnitealloypickaxe"), new ResourceLocation("coalnitealloypickaxe"), new ItemStack(ItemReg.CoalnitePickaxe), new Object[]{
                "III",
                " R ",
                " R ",
                'R', ItemReg.CoalniteAlloyRod,
                'I', ItemReg.CoalniteAlloyIngot
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("coalnitealloyaxe"), new ResourceLocation("coalnitealloyaxe"), new ItemStack(ItemReg.CoalniteAxe), new Object[]{
                "II ",
                "IR ",
                " R ",
                'R', ItemReg.CoalniteAlloyRod,
                'I', ItemReg.CoalniteAlloyIngot
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("coalnitealloyaxe_1"), new ResourceLocation("coalnitealloyaxe_1"), new ItemStack(ItemReg.CoalniteAxe), new Object[]{
                " II",
                " RI",
                " R ",
                'R', ItemReg.CoalniteAlloyRod,
                'I', ItemReg.CoalniteAlloyIngot
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("CoalniteShovel"), new ResourceLocation("CoalniteShovel"), new ItemStack(ItemReg.CoalniteShovel), new Object[]{
                " I ",
                " R ",
                " R ",
                'R', ItemReg.CoalniteAlloyRod,
                'I', ItemReg.CoalniteAlloyIngot
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("CoalniteSword"), new ResourceLocation("CoalniteSword"), new ItemStack(ItemReg.CoalniteSword), new Object[]{
                " I ",
                " I ",
                " R ",
                'R', ItemReg.CoalniteAlloyRod,
                'I', ItemReg.CoalniteAlloyIngot
        });
    }
}