package com.pahimar.ee3.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public interface IKeyBound {

    public abstract void doKeyBindingAction(EntityPlayer thePlayer, ItemStack itemStack, String keyBinding);

}
