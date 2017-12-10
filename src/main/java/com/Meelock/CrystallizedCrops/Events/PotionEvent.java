package com.Meelock.CrystallizedCrops.Events;
//Created initially by Meelock on 7/12/2017.

import com.Meelock.CrystallizedCrops.CCMain;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class PotionEvent {


    @SubscribeEvent
    public void onEntityUpdate(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntityLiving().isPotionActive(CCMain.mysteriousPoison)) {
            if (event.getEntityLiving().getActivePotionEffect(CCMain.mysteriousPoison).getDuration() == 0) {
                event.getEntityLiving().removePotionEffect(CCMain.mysteriousPoison);
            } else if (event.getEntityLiving().world.getTotalWorldTime() % 200 == 0) {
                event.getEntityLiving().attackEntityFrom(DamageSource.GENERIC, 2);
            }
        }
    }
}


