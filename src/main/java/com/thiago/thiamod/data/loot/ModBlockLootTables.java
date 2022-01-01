package com.thiago.thiamod.data.loot;

import com.thiago.thiamod.setup.ModBlocks;
import com.thiago.thiamod.setup.Registration;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        dropSelf(ModBlocks.BLOCO_DE_BATATA.get());
        dropSelf(ModBlocks.BLOCO_PEDREGULHO_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_PEDREGULHO_ARDOSIA_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_TUFO_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_GRANITO_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_DIORITO_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_ARDESITO_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_CALCITA_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_TERRA_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_AREIA_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_AREIA_VERMELHA_COMPACTADO.get());
        dropSelf(ModBlocks.BLOCO_CASCALHO_COMPACTADO.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
