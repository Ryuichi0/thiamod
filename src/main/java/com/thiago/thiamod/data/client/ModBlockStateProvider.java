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
        simpleBlock(ModBlocks.BLOCO_PEDREGULHO_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_PEDREGULHO_ARDOSIA_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_TUFO_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_GRANITO_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_DIORITO_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_ARDESITO_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_CALCITA_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_TERRA_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_AREIA_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_AREIA_VERMELHA_COMPACTADO.get());
        simpleBlock(ModBlocks.BLOCO_CASCALHO_COMPACTADO.get());


    }
}
