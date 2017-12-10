package com.Meelock.CrystallizedCrops.Proxy;


import com.Meelock.CrystallizedCrops.Blocks.CCBlocks;
import com.Meelock.CrystallizedCrops.Blocks.CCrystal;
import com.Meelock.CrystallizedCrops.CCMain;
import com.Meelock.CrystallizedCrops.Config.Config;
import com.Meelock.CrystallizedCrops.Events.PotionEvent;
import com.Meelock.CrystallizedCrops.Items.CCItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

public class CommonProxy {
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
        CCItems.init();
//        CCCrafting.init();

        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "CrystallizedCrops.cfg"));
        Config.readConfig();

        MinecraftForge.EVENT_BUS.register(new PotionEvent());
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new CCrystal());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(CCBlocks.ccrystal).setRegistryName(CCBlocks.ccrystal.getRegistryName()));
    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.register(CCMain.mysteriousPoison);

    }

    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }
}