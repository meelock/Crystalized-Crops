package com.Meelock.CrystallizedCrops.Items;
//Created initially by Meelock on 3/3/2017.

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CCItems {
    public static CCItem living_crystal_shard;
    public static CCVanillaCrystal eta_crystal;
    public static CCVanillaCrystal zeta_crystal;
    public static CCVanillaCrystal epsilon_crystal;
    public static CCVanillaCrystal delta_crystal;
    public static CCVanillaCrystal gamma_crystal;
    public static CCVanillaCrystal beta_crystal;
    public static CCVanillaCrystal alpha_crystal;
    public static CCVanillaCrystal basic_crystal_1;
    public static CCVanillaCrystal basic_crystal_2;
    public static CCItem d_crystite_dust;
    public static CCItem d_crystite_ingot;
    public static CCItem l_crystite_dust;
    public static CCItem l_crystite_ingot;

    public static void init() {
        living_crystal_shard = new CCItem("item_living_crystal_shard", "living_crystal_shard");
        eta_crystal = new CCVanillaCrystal("item_eta_crystal", "eta_crystal");
        zeta_crystal = new CCVanillaCrystal("item_zeta_crystal", "zeta_crystal");
        delta_crystal = new CCVanillaCrystal("item_delta_crystal", "delta_crystal");
        gamma_crystal = new CCVanillaCrystal("item_gamma_crystal", "gamma_crystal");
        beta_crystal = new CCVanillaCrystal("item_beta_crystal", "beta_crystal");
        alpha_crystal = new CCVanillaCrystal("item_alpha_crystal", "alpha_crystal");
        epsilon_crystal = new CCVanillaCrystal("item_epsilon_crystal", "epsilon_crystal");
        basic_crystal_1 = new CCVanillaCrystal("item_basic_crystal_1", "basic_crystal_1");
        basic_crystal_2 = new CCVanillaCrystal("item_basic_crystal_2", "basic_crystal_2");
        d_crystite_dust = new CCItem("item_d_crystite_dust", "d_crystalized_dust").setCreativeTab(CreativeTabs.MATERIALS);
        d_crystite_ingot = new CCItem("item_d_crystite_ingot", "d_crystite_ingot").setCreativeTab(CreativeTabs.MATERIALS);
        l_crystite_dust = new CCItem("item_l_crystite_dust", "l_crystite_dust").setCreativeTab(CreativeTabs.MATERIALS);
        l_crystite_ingot = new CCItem("item_l_crystite_ingot", "l_crystite_ingot").setCreativeTab(CreativeTabs.MATERIALS);
    }

    @SideOnly(Side.CLIENT)
    public void initModels() {
        living_crystal_shard.initModel();
        eta_crystal.initModel();
        zeta_crystal.initModel();
        delta_crystal.initModel();
        gamma_crystal.initModel();
        beta_crystal.initModel();
        alpha_crystal.initModel();
        epsilon_crystal.initModel();
        basic_crystal_1.initModel();
        basic_crystal_2.initModel();
        d_crystite_dust.initModel();
        d_crystite_ingot.initModel();
        l_crystite_dust.initModel();
        l_crystite_ingot.initModel();
    }
}
