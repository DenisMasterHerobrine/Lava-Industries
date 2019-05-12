package com.stylegame.lavaindustries.proxy;

import com.stylegame.lavaindustries.config.Config;
import com.stylegame.lavaindustries.register.BlocksRegister;
import com.stylegame.lavaindustries.crafts.CraftRegister;
import com.stylegame.lavaindustries.register.ItemReg;
import com.stylegame.lavaindustries.worldgen.WorldGenRegister;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class CommonProxy
{
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent event)
{
    WorldGenRegister.register();
    ItemReg.register();
    BlocksRegister.register();

    File directory = event.getModConfigurationDirectory();
    config = new Configuration(new File(directory.getPath(), "LavaIndustries.cfg"));
    Config.readConfig();
}
    public void init(FMLInitializationEvent event){
        CraftRegister.recipesRegister();
        WorldGenRegister.register();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}