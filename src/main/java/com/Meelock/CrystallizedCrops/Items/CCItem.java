package com.Meelock.CrystallizedCrops.Items;
//Created initially by Meelock on 3/3/2017.

import com.Meelock.CrystallizedCrops.CCMain;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CCItem extends Item {

    public CCItem(String registryname, String unlocalizedname) {
        setRegistryName(registryname);        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(CCMain.MODID + "." + unlocalizedname);     // Used for localization (en_US.lang)
        GameRegistry.register(this);
    }
}
