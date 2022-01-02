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
        dropSelf(ModBlocks.IV_PEDREGULHO.get());
        dropSelf(ModBlocks.IV_PEDREGULHO_ARDOSIA.get());
        dropSelf(ModBlocks.IV_TUFO.get());
        dropSelf(ModBlocks.IV_GRANITO.get());
        dropSelf(ModBlocks.IV_DIORITO.get());
        dropSelf(ModBlocks.IV_ARDESITO.get());
        dropSelf(ModBlocks.IV_CALCITA.get());
        dropSelf(ModBlocks.IV_TERRA.get());
        dropSelf(ModBlocks.IV_AREIA.get());
        dropSelf(ModBlocks.IV_AREIA_VERMELHA.get());
        dropSelf(ModBlocks.IV_CASCALHO.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
