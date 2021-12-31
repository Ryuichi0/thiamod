package com.thiago.thiamod.setup;

import com.thiago.thiamod.ThiaMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> BLOCO_DE_BATATA = register("bloco_de_batata",
            () -> new Block(BlockBehaviour.Properties.of(Material.VEGETABLE, MaterialColor.COLOR_YELLOW)
                    .strength(4.0F)
                    .sound(SoundType.FUNGUS)));

    static void register() {}

    private static <T extends Block>RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ThiaMod.THIAMOD_TAB)));
        return ret;
    }
}
