package com.thiago.thiamod.data.client;

import com.thiago.thiamod.ThiaMod;
import com.thiago.thiamod.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ThiaMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BLOCO_DE_BATATA.get());
        simpleBlock(ModBlocks.VIII_PEDREGULHO.get());
        simpleBlock(ModBlocks.VIII_PEDREGULHO_ARDOSIA.get());
        simpleBlock(ModBlocks.VIII_TUFO.get());
        simpleBlock(ModBlocks.VIII_GRANITO.get());
        simpleBlock(ModBlocks.VIII_DIORITO.get());
        simpleBlock(ModBlocks.VIII_ARDESITO.get());
        simpleBlock(ModBlocks.VIII_CALCITA.get());
        simpleBlock(ModBlocks.VIII_TERRA.get());
        simpleBlock(ModBlocks.VIII_AREIA.get());
        simpleBlock(ModBlocks.VIII_AREIA_VERMELHA.get());
        simpleBlock(ModBlocks.VIII_CASCALHO.get());


    }
}
