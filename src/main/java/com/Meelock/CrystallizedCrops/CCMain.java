package com.Meelock.CrystallizedCrops;


import com.Meelock.CrystallizedCrops.Proxy.CommonProxy;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = CCMain.MODID, name = CCMain.MODNAME, version = CCMain.MODVERSION, dependencies = "required-after:forge@[13.20.1.2386,)", useMetadata = true)
public class CCMain {

    public static final String MODID = "crystallizedcrops";
    public static final String MODNAME = "Crystallized Crops";
    public static final String MODVERSION = "1.11.2-0.0.1";

    @SidedProxy(clientSide = "com.Meelock.CrystallizedCrops.Proxy.ClientProxy", serverSide = "com.Meelock.CrystallizedCrops.Proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static CCMain instance;

    public static Logger logger;

    public static Potion mysteriousPoison;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        Potion[] potionTypes = null;
        mysteriousPoison = new MysteriousPoison(true, 0x000000, 0).setPotionName("potion.mysterious_poison");

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