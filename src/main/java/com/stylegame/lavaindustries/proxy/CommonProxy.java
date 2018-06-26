package com.stylegame.lavaindustries.proxy;

import com.stylegame.lavaindustries.items.ItemReg;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemReg.register();
    }

    public void init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}