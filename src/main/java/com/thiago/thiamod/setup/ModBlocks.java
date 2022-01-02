package com.thiago.thiamod.setup;

import com.thiago.thiamod.ThiaMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
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
    public static final RegistryObject<Block> IV_PEDREGULHO = register("4x_pedregulho",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .strength(4.0F, 7.0F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> IV_PEDREGULHO_ARDOSIA = register("4x_pedregulho_ardosia",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
                    .strength(7.0F, 7.0F)
                    .sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> IV_TUFO = register("4x_tufo",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
                    .strength(3.0F, 7.0F)
                    .sound(SoundType.TUFF)));
    public static final RegistryObject<Block> IV_GRANITO = register("4x_granito",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT)
                    .strength(3.0F, 7.0F)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> IV_DIORITO = register("4x_diorito",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
                    .strength(3.0F, 7.0F)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> IV_ARDESITO = register("4x_ardesito",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .strength(3.0F, 7.0F)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> IV_CALCITA = register("4x_calcita",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                    .strength(1.5F, 1.0F)
                    .sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> IV_TERRA = register("4x_terra",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT)
                    .strength(1.0F, 1.0F)
                    .sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> IV_AREIA = register("4x_areia",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)
                    .strength(1.0F, 1.0F)));
    public static final RegistryObject<Block> IV_AREIA_VERMELHA = register("4x_areia_vermelha",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.RED_SAND)
                    .strength(1.0F, 1.0F)));
    public static final RegistryObject<Block> IV_CASCALHO = register("4x_cascalho",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .strength(1.2F, 1.0F)));



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
