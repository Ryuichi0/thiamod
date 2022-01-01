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
    public static final RegistryObject<Block> BLOCO_PEDREGULHO_COMPACTADO = register("bloco_pedregulho_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .strength(4.0F, 7.0F)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLOCO_PEDREGULHO_ARDOSIA_COMPACTADO = register("bloco_pedregulho_ardosia_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
                    .strength(7.0F, 7.0F)
                    .sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> BLOCO_TUFO_COMPACTADO = register("bloco_tufo_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
                    .strength(3.0F, 7.0F)
                    .sound(SoundType.TUFF)));
    public static final RegistryObject<Block> BLOCO_GRANITO_COMPACTADO = register("bloco_granito_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT)
                    .strength(3.0F, 7.0F)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOCO_DIORITO_COMPACTADO = register("bloco_diorito_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
                    .strength(3.0F, 7.0F)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOCO_ARDESITO_COMPACTADO = register("bloco_ardesito_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
                    .strength(3.0F, 7.0F)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOCO_CALCITA_COMPACTADO = register("bloco_calcita_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
                    .strength(1.5F, 1.0F)
                    .sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> BLOCO_TERRA_COMPACTADO = register("bloco_terra_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT)
                    .strength(1.0F, 1.0F)
                    .sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> BLOCO_AREIA_COMPACTADO = register("bloco_areia_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND)
                    .strength(1.0F, 1.0F)
                    .sound(SoundType.SAND)));
    public static final RegistryObject<Block> BLOCO_AREIA_VERMELHA_COMPACTADO = register("bloco_areia_vermelha_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
                    .strength(1.0F, 1.0F)
                    .sound(SoundType.SAND)));
    public static final RegistryObject<Block> BLOCO_CASCALHO_COMPACTADO = register("bloco_cascalho_compactado",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.STONE)
                    .strength(1.2F, 1.0F)
                    .sound(SoundType.GRAVEL)));



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
