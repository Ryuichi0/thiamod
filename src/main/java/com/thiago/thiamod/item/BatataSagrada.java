package com.thiago.thiamod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BatataSagrada extends Item {
    public BatataSagrada(Properties properties) {
        super(properties);

    }

    @Override
    public boolean isFoil(ItemStack p_41453_) {
        return true;
    }
}
