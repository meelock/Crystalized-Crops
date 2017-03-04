package com.Meelock.CrystallizedCrops.Proxy;


import com.Meelock.CrystallizedCrops.Blocks.CCBlocks;
import com.Meelock.CrystallizedCrops.Config.Config;
import com.Meelock.CrystallizedCrops.Crafting.CCCrafting;
import com.Meelock.CrystallizedCrops.Items.CCItems;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        // Initialization of blocks and items typically goes here:
        CCBlocks.init();
        CCItems.init();
        CCCrafting.init();

        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "CrystallizedCrops.cfg"));
        Config.readConfig();
    }


    public static Configuration config;

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }
}