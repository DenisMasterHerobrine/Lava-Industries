package com.stylegame.lavaindustries.proxy;

import com.stylegame.lavaindustries.register.BlocksRegister;
import com.stylegame.lavaindustries.hadlers.FuelHandler;
import com.stylegame.lavaindustries.register.ItemReg;
import com.stylegame.lavaindustries.worldgen.WorldGenRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        BlocksRegister.registerRender();
        ItemReg.registerRender();
        super.init(event);
        GameRegistry.registerFuelHandler(new FuelHandler());
        WorldGenRegister.register();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}