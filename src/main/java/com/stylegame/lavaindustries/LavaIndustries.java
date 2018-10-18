package com.stylegame.lavaindustries;

import com.stylegame.lavaindustries.creativetabs.TabLI;
import com.stylegame.lavaindustries.proxy.CommonProxy;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LavaIndustries.MODID, name = "Lava Industries", version = LavaIndustries.VERSION)
public class LavaIndustries {
    public static final String MODID = "lavaindustries";
    public static final String VERSION = "1.0.3.21";
    @SidedProxy(clientSide = "com.stylegame.lavaindustries.proxy.ClientProxy", serverSide = "com.stylegame.lavaindustries.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static CreativeTabs tabLI = new TabLI("tabLI");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        System.out.println("Lava Industries Pre-Initialization Stage Starts...");
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        System.out.println("Lava Industries Initialization Stage Starts...");
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        System.out.println("Lava Industries Post-Initialization Stage Starts...");
    }
}