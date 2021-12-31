package com.thiago.thiamod.setup;

import com.thiago.thiamod.ThiaMod;
import com.thiago.thiamod.item.BatataSagrada;
import com.thiago.thiamod.item.FuelItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> CARVAOZINHO = Registration.ITEMS.register("carvaozinho",
            () -> new FuelItem(new Item.Properties().tab(ThiaMod.THIAMOD_TAB), 200));
    public static final RegistryObject<Item> BCOIN = Registration.ITEMS.register("bcoin",
            () -> new Item(new Item.Properties().tab(ThiaMod.THIAMOD_TAB)));
    public static final RegistryObject<Item> BATATA_SAGRADA = Registration.ITEMS.register("batata_sagrada",
            () -> new BatataSagrada(new Item.Properties().tab(ThiaMod.THIAMOD_TAB)));
    public static final RegistryObject<Item> BATATA_DOURADA = Registration.ITEMS.register("batata_dourada",
            () -> new Item(new Item.Properties().tab(ThiaMod.THIAMOD_TAB)));

    public static void register() {}
}
