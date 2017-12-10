package com.Meelock.CrystallizedCrops.Items;
//Created initially by Meelock on 3/3/2017.

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CCItem extends Item {

    public CCItem(String registryname, String unlocalizedname) {
        setRegistryName(registryname);        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(unlocalizedname);     // Used for localization (en_US.lang) CCMain.MODID + "." +
        GameRegistry.register(this);

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public CCItem setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
