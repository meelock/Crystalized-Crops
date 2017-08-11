package com.Meelock.CrystallizedCrops;
//Created initially by Meelock on 7/12/2017.

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MysteriousPoison extends Potion {


    public static ResourceLocation TEXTURE = new ResourceLocation("crystallizedcrops", "textures/misc/mysterious_poison.png");

    public MysteriousPoison(boolean badEffect, int color, int iconIndex) {
        super(badEffect, color);
        setIconIndex(iconIndex % 8, iconIndex / 8);
        setRegistryName(new ResourceLocation("crystallizedcrops:mysterious_poison"));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getStatusIconIndex() {
        Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);

        return super.getStatusIconIndex();
    }

}

