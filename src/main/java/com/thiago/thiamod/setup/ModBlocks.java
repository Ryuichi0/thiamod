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

    public static final RegistryObject<Block> VIII_PEDREGULHO = register("8x_pedregulho",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(4.0F, 7.0F)));
    public static final RegistryObject<Block> VIII_PEDREGULHO_ARDOSIA = register("8x_pedregulho_ardosia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(7.0F, 7.0F)));
    public static final RegistryObject<Block> VIII_TUFO = register("8x_tufo",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)
                    .strength(3.0F, 7.0F)));
    public static final RegistryObject<Block> VIII_GRANITO = register("8x_granito",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE)
                    .strength(3.0F, 7.0F)));

    public static final RegistryObject<Block> VIII_DIORITO = register("8x_diorito",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .strength(3.0F, 7.0F)));
    public static final RegistryObject<Block> VIII_ARDESITO = register("8x_ardesito",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE)
                    .strength(3.0F, 7.0F)));

    public static final RegistryObject<Block> VIII_CALCITA = register("8x_calcita",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)
                    .strength(1.5F, 1.0F)));
    public static final RegistryObject<Block> VIII_TERRA = register("8x_terra",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .strength(1.0F, 1.0F)));
    public static final RegistryObject<Block> VIII_AREIA = register("8x_areia",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)
                    .strength(1.0F, 1.0F)));
    public static final RegistryObject<Block> VIII_AREIA_VERMELHA = register("8x_areia_vermelha",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.RED_SAND)
                    .strength(1.0F, 1.0F)));
    public static final RegistryObject<Block> VIII_CASCALHO = register("8x_cascalho",
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
