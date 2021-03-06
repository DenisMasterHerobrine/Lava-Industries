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

        GameRegistry.addShapedRecipe(new ResourceLocation("CoalniteAlloyRod"), new ResourceLocation("CoalniteAlloyRod"), new ItemStack(ItemReg.CoalniteAlloyRod), new Object[]{
                "  L",
                " I ",
                "L  ",
                'L', ItemReg.LavaIngot,
                'I', ItemReg.CoalniteAlloyIngot
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

        GameRegistry.addShapedRecipe(new ResourceLocation("LavaIngot"), new ResourceLocation("LavaIngot"), new ItemStack(ItemReg.LavaIngot), new Object[]{
                "GLG",
                "LIL",
                "GLG",
                'I', ItemReg.CoalniteAlloyIngot,
                'L', Items.LAVA_BUCKET,
                'G', Items.GOLD_INGOT
        });

        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(BlocksRegister.Darkstone, 1), new ItemStack(BlocksRegister.RefinedDarkstone, 1), 0.7f);
        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(BlocksRegister.DarkstoneBricks, 1), new ItemStack(BlocksRegister.RefinedDarkstone, 1), 0.35f);

        GameRegistry.addShapedRecipe(new ResourceLocation("DarkstoneBricks"), new ResourceLocation("DarkstoneBricks"), new ItemStack(BlocksRegister.DarkstoneBricks), new Object[]{
                "D  ",
                "   ",
                "   ",
                'D', BlocksRegister.Darkstone
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("Darkstone"), new ResourceLocation("Darkstone"), new ItemStack(BlocksRegister.Darkstone), new Object[]{
                "SB ",
                "   ",
                "   ",
                'S', Blocks.STONE,
                'B', Items.FLINT
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("TorchVanilla"), new ResourceLocation("TorchVanilla"), new ItemStack(Blocks.TORCH, 16), new Object[]{
                " L ",
                " S ",
                "   ",
                'S', Items.STICK,
                'L', ItemReg.LavaCoal
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("FireChargeVanilla"), new ResourceLocation("FireChargeVanilla"), new ItemStack(Items.FIRE_CHARGE, 8), new Object[]{
                "GB ",
                "L  ",
                "   ",
                'B', Items.BLAZE_POWDER,
                'L', ItemReg.LavaCoal,
                'G', Items.GUNPOWDER
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("LavaInfusedDiamond"), new ResourceLocation("LavaInfusedDiamond"), new ItemStack(ItemReg.LavaInfusedDiamond), new Object[]{
                "ICI",
                "CDC",
                "ICI",
                'I', ItemReg.LavaIngot,
                'C', ItemReg.CoalniteAlloyIngot,
                'D', Items.DIAMOND
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("LavaInfusedHelmet"), new ResourceLocation("LavaInfusedHelmet"), new ItemStack(ItemReg.HEAD), new Object[]{
                "IDI",
                "C C",
                "   ",
                'I', ItemReg.LavaIngot,
                'C', ItemReg.CoalniteAlloyIngot,
                'D', ItemReg.LavaInfusedDiamond
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("LavaInfusedChestplate"), new ResourceLocation("LavaInfusedChestplate"), new ItemStack(ItemReg.CHESTPLATE), new Object[]{
                "I I",
                "CDC",
                "CIC",
                'I', ItemReg.LavaIngot,
                'C', ItemReg.CoalniteAlloyIngot,
                'D', ItemReg.LavaInfusedDiamond
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("LavaInfusedLeggings"), new ResourceLocation("LavaInfusedLeggings"), new ItemStack(ItemReg.LEGS), new Object[]{
                "IDI",
                "C C",
                "C C",
                'I', ItemReg.LavaIngot,
                'C', ItemReg.CoalniteAlloyIngot,
                'D', ItemReg.LavaInfusedDiamond
        });

        GameRegistry.addShapedRecipe(new ResourceLocation("LavaInfusedBoots"), new ResourceLocation("LavaInfusedBoots"), new ItemStack(ItemReg.BOOTS), new Object[]{
                "C C",
                "IDI",
                "   ",
                'I', ItemReg.LavaIngot,
                'C', ItemReg.CoalniteAlloyIngot,
                'D', ItemReg.LavaInfusedDiamond
        });
    }
}