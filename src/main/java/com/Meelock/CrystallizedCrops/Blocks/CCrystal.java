package com.Meelock.CrystallizedCrops.Blocks;
//Created initially by Meelock on 3/3/2017.

import com.Meelock.CrystallizedCrops.CCMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CCrystal extends Block {
    public CCrystal() {
        super(Material.ROCK);
        setUnlocalizedName(CCMain.MODID + ".CCrystal");     // Used for localization (en_US.lang)
        setRegistryName("ccrystal");        // The unique name (within your mod) that identifies this block
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}
