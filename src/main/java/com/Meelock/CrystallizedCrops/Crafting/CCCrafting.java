package com.Meelock.CrystallizedCrops.Crafting;
//Created initially by Meelock on 3/3/2017.

import com.Meelock.CrystallizedCrops.Items.CCItem;
import com.Meelock.CrystallizedCrops.Items.CCItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CCCrafting {
    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(CCItems.eta_crystal),
            new Object[] {CCItems.living_crystal_shard, CCItems.living_crystal_shard,
            CCItems.living_crystal_shard, CCItems.living_crystal_shard, CCItems.d_crystite_dust});

    }
}
