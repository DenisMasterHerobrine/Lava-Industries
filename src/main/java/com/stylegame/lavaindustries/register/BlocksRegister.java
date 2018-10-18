package com.stylegame.lavaindustries.register;

import com.stylegame.lavaindustries.baseores.LavaCoalOreParams;
import com.stylegame.lavaindustries.baseores.OtherBlockParams;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlocksRegister
{
    public static Block LavaCoalOre = new LavaCoalOreParams(Material.ROCK, "LavaCoalOre", "LavaCoalOre", "pickaxe", 2, 15.0F, 1.0F);
    public static Block MachineCase = new OtherBlockParams(Material.ROCK, "MachineCase", "MachineCase", "pickaxe", 1, 7.0F, 2.0F);
    public static Block LavaCoalBlock = new OtherBlockParams(Material.ROCK, "LavaCoalBlock", "LavaCoalBlock", "pickaxe", 2, 25.0F, 3.0F);
    public static Block Darkstone = new OtherBlockParams(Material.ROCK, "Darkstone", "Darkstone", "pickaxe", 1, 12.0F, 1.5F);
    public static Block DarkstoneBricks = new OtherBlockParams(Material.ROCK, "DarkstoneBricks", "DarkstoneBricks", "pickaxe", 1, 12.0F, 1.5F);
    public static Block RefinedDarkstone = new OtherBlockParams(Material.ROCK, "RefinedDarkstone", "RefinedDarkstone", "pickaxe", 1, 12.0F, 1.5F);
    public static void register()
    {
        setRegister(LavaCoalOre);
        setRegister(MachineCase);
        setRegister(LavaCoalBlock);
        setRegister(Darkstone);
        setRegister(DarkstoneBricks);
        setRegister(RefinedDarkstone);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender()
    {
        setRender(LavaCoalOre);
        setRender(MachineCase);
        setRender(LavaCoalBlock);
        setRender(Darkstone);
        setRender(DarkstoneBricks);
        setRender(RefinedDarkstone);
    }

    private static void setRegister(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}