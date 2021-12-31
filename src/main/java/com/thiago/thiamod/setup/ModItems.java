package com.thiago.thiamod.setup;

import com.thiago.thiamod.ThiaMod;
import com.thiago.thiamod.item.BatataSagrada;
import com.thiago.thiamod.item.FuelItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //Itens
    public static final RegistryObject<Item> CARVAOZINHO = Registration.ITEMS.register("carvaozinho",
            () -> new FuelItem(new Item.Properties().tab(ThiaMod.THIAMOD_TAB), 200));
    public static final RegistryObject<Item> BCOIN = Registration.ITEMS.register("bcoin",
            () -> new Item(new Item.Properties().tab(ThiaMod.THIAMOD_TAB)));
    public static final RegistryObject<Item> BATATA_SAGRADA = Registration.ITEMS.register("batata_sagrada",
            () -> new BatataSagrada(new Item.Properties().tab(ThiaMod.THIAMOD_TAB)));
    public static final RegistryObject<Item> BATATA_DOURADA = Registration.ITEMS.register("batata_dourada",
            () -> new Item(new Item.Properties().tab(ThiaMod.THIAMOD_TAB)));

    //Ferramentas
    public static final RegistryObject<Item> PICARETA_DE_BTTSA = Registration.ITEMS.register("picareta_de_bttsa",
            () -> new PickaxeItem(ModTiers.BATATA_SAGRADA, 1, -2.8F,
                    new Item.Properties().tab(ThiaMod.THIAMOD_TAB)));

    //Armaduras
    public static final RegistryObject<Item> PEITORAL_DE_BCOIN = Registration.ITEMS.register("peitoral_de_bcoin",
            () -> new ArmorItem(ModArmorMaterials.BCOIN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ThiaMod.THIAMOD_TAB)));

    public static void register() {}
}
