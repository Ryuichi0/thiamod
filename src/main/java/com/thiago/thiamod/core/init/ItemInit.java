package com.thiago.thiamod.core.init;

import com.thiago.thiamod.ThiaMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
    private ItemInit() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThiaMod.MODID);

    public static final RegistryObject<Item> CARVAOZINHO = ITEMS.register("carvaozinho",
            () -> new FuelItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BCOIN = ITEMS.register("bcoin",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
