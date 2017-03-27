package com.Meelock.CrystallizedCrops;


import com.Meelock.CrystallizedCrops.Proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = CCMain.MODID, name = CCMain.MODNAME, version = CCMain.MODVERSION, dependencies = "required-after:Forge@[12.18.3.2239,)", useMetadata = true)
public class CCMain {

    public static final String MODID = "crystallizedcrops";
    public static final String MODNAME = "Crystallized Crops";
    public static final String MODVERSION = "1.10.2-0.0.1";

    @SidedProxy(clientSide = "com.Meelock.CrystallizedCrops.Proxy.ClientProxy", serverSide = "com.Meelock.CrystallizedCrops.Proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static CCMain instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }


}