package com.Meelock.CrystallizedCrops.Blocks;


import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CCBlocks {
        public static CCrystal ccrystal;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ccrystal.initModel();
    }

}
