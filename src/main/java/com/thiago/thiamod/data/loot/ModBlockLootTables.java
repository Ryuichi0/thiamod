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
        dropSelf(ModBlocks.VIII_PEDREGULHO.get());
        dropSelf(ModBlocks.VIII_PEDREGULHO_ARDOSIA.get());
        dropSelf(ModBlocks.VIII_TUFO.get());
        dropSelf(ModBlocks.VIII_GRANITO.get());
        dropSelf(ModBlocks.VIII_DIORITO.get());
        dropSelf(ModBlocks.VIII_ARDESITO.get());
        dropSelf(ModBlocks.VIII_CALCITA.get());
        dropSelf(ModBlocks.VIII_TERRA.get());
        dropSelf(ModBlocks.VIII_AREIA.get());
        dropSelf(ModBlocks.VIII_AREIA_VERMELHA.get());
        dropSelf(ModBlocks.VIII_CASCALHO.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
