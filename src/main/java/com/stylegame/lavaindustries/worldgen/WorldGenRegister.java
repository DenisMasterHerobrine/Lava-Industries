package com.stylegame.lavaindustries.worldgen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGenRegister {

    public static void register() {

        GameRegistry.registerWorldGenerator(new OreWorldGen(), 0);

    }

}