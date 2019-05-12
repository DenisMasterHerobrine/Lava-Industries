package com.stylegame.lavaindustries.config;

import com.stylegame.lavaindustries.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

public class Config {
    private static final String CATEGORY_GENERAL = "general";

    public static int sizeLavaCoal = 6;
    public static int sizeDarkstone = 16;

    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            System.out.println("Problem loading config file!");
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        sizeLavaCoal = cfg.getInt("sizeLavaCoalVein", CATEGORY_GENERAL, sizeLavaCoal, 0, 25600, "How much ore blocks can be in Lava Coal vein? Set this to 0 to disable Lava Coal Ore generation.");
        sizeDarkstone = cfg.getInt("sizeDarkstoneVein", CATEGORY_GENERAL, sizeDarkstone, 0, 25600, "How much Darkstone blocks can be in Darkstone vein? Set this to 0 to disable Darkstone generation");
    }
}
