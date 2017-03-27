package com.Meelock.CrystallizedCrops.Config;


import com.Meelock.CrystallizedCrops.CCMain;
import com.Meelock.CrystallizedCrops.Proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {

    private static final String CATEGORY_WORLDGEN = "worldgen";
    private static final String CATEGORY_INTEGRATION = "integration";
    private static final String CATIGORY_RENDER = "render";

    // This values below you can access elsewhere in your mod:
    public static boolean CCWorldGeneration = true;
    public static boolean CCTEIntegration = true;
    public static boolean CCThreeDItems = true;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
            initIntegrationConfig(cfg);
            initRenderConfig(cfg);
        } catch (Exception e1) {
            CCMain.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_WORLDGEN, "General configuration");
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        CCWorldGeneration = cfg.getBoolean("CCWorldGeneration", CATEGORY_WORLDGEN, CCWorldGeneration, "Set to false to turn of world gen.");

    }

    private static void initIntegrationConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_INTEGRATION, "Mod Integration");
        CCTEIntegration = cfg.getBoolean("TEIntegration", CATEGORY_INTEGRATION, CCTEIntegration, "Set to false to turn off thermal expansion ore crystals.");

    }

    public static void initRenderConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATIGORY_RENDER, "CC Render Control");
        CCThreeDItems = cfg.getBoolean("CCIntegration", CATIGORY_RENDER, CCThreeDItems, "Set to false to turn off 3D items and tools.");
    }
}
