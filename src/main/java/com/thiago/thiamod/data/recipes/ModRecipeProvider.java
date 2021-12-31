package com.thiago.thiamod.data.recipes;

import com.thiago.thiamod.setup.ModBlocks;
import com.thiago.thiamod.setup.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        //Itens
        //---Shaped
        ShapedRecipeBuilder.shaped(ModItems.BCOIN.get())
                .define('T', Items.TNT)
                .define('H', Items.GOLD_INGOT)
                .pattern(" H ")
                .pattern("HTH")
                .pattern(" H ")
                .unlockedBy("has_material ", has(Items.GOLD_INGOT))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.BATATA_DOURADA.get())
                .define('T', Items.POTATO)
                .define('H', Items.GOLD_INGOT)
                .pattern("HHH")
                .pattern("HTH")
                .pattern("HHH")
                .unlockedBy("has_material ", has(Items.POTATO))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.BATATA_SAGRADA.get())
                .define('T', ModBlocks.BLOCO_DE_BATATA.get())
                .define('H', Items.AMETHYST_SHARD)
                .define('I', Items.DIAMOND)
                .pattern("IHI")
                .pattern("HTH")
                .pattern("IHI")
                .unlockedBy("has_material ", has(ModBlocks.BLOCO_DE_BATATA.get()))
                .save(consumer);

        //Shapeless
        ShapelessRecipeBuilder.shapeless(Items.COAL)
                .requires(ModItems.CARVAOZINHO.get(), 9)
                .unlockedBy("has_material ", has(ModItems.CARVAOZINHO.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.CARVAOZINHO.get(), 9)
                .requires(Items.COAL)
                .unlockedBy("has_material ", has(Items.COAL))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.POTATO, 9)
                .requires(ModBlocks.BLOCO_DE_BATATA.get())
                .unlockedBy("has_material ", has(Items.POTATO))
                .save(consumer);

        //Blocos
        //---Shaped
        //---Shapeless
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_DE_BATATA.get())
                .requires(Items.POTATO, 9)
                .unlockedBy("has_material ", has(Items.POTATO))
                .save(consumer);

    }
}
