package com.stylegame.lavaindustries.proxy;

import com.stylegame.lavaindustries.register.BlocksRegister;
import com.stylegame.lavaindustries.crafts.CraftRegister;
import com.stylegame.lavaindustries.register.ItemReg;
import com.stylegame.lavaindustries.worldgen.WorldGenRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        WorldGenRegister.register();
        ItemReg.register();
        BlocksRegister.register();
    }

    public void init(FMLInitializationEvent event){
        CraftRegister.recipesRegister();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}