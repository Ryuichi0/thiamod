package com.thiago.thiamod.setup;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier BATATA_SAGRADA = new ForgeTier(3, 1796, 8.5F,
            3.5F, 12, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.BATATA_SAGRADA.get()));

}
