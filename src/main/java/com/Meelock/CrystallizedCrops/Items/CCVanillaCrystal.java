package com.Meelock.CrystallizedCrops.Items;
//Created initially by Meelock on 3/7/2017.

import com.Meelock.CrystallizedCrops.CCMain;
import com.Meelock.CrystallizedCrops.Config.Config;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CCVanillaCrystal extends Item {

    public CCVanillaCrystal(String registryname, String Unlocalizedname) {
        setRegistryName(registryname);
        setUnlocalizedName(CCMain.MODID + "." + Unlocalizedname);
        GameRegistry.register(this);
        GameRegistry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        final ModelResourceLocation flatModel = new ModelResourceLocation(getRegistryName() + "_flat", "inventory");
        final ModelResourceLocation threeDModel = new ModelResourceLocation(getRegistryName() + "_3d", "inventory");

        ModelBakery.registerItemVariants(this, flatModel, threeDModel);

        ModelLoader.setCustomMeshDefinition(this, new ItemMeshDefinition() {
            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                if (Config.CCThreeDItems) {
                    return flatModel;
                } else {
                    return threeDModel;
                }
            }
        });
    }
}

