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
        ShapedRecipeBuilder.shaped(ModItems.PICARETA_DE_BTTSA.get())
                .define('T', ModItems.BATATA_SAGRADA.get())
                .define('H', Items.STICK)
                .pattern("TTT")
                .pattern(" H ")
                .pattern(" H ")
                .unlockedBy("has_material ", has(ModItems.BATATA_SAGRADA.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PEITORAL_DE_BCOIN.get())
                .define('T', ModItems.BCOIN.get())
                .define('H', Items.IRON_INGOT)
                .pattern("HTH")
                .pattern("HHH")
                .pattern("HHH")
                .unlockedBy("has_material ", has(ModItems.BCOIN.get()))
                .save(consumer);

        //---Shapeless
        ShapelessRecipeBuilder.shapeless(Items.COAL)
                .requires(ModItems.CARVAOZINHO.get(), 8)
                .unlockedBy("has_material ", has(ModItems.CARVAOZINHO.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.CARVAOZINHO.get(), 8)
                .requires(Items.COAL)
                .unlockedBy("has_material ", has(Items.COAL))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.POTATO, 9)
                .requires(ModBlocks.BLOCO_DE_BATATA.get())
                .unlockedBy("has_material ", has(Items.POTATO))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.COBBLESTONE, 4)
                .requires(ModBlocks.IV_PEDREGULHO.get())
                .unlockedBy("has_material ", has(Items.COBBLESTONE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.COBBLED_DEEPSLATE, 4)
                .requires(ModBlocks.IV_PEDREGULHO_ARDOSIA.get())
                .unlockedBy("has_material ", has(Items.COBBLED_DEEPSLATE))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(Items.TUFF, 4)
                .requires(ModBlocks.IV_TUFO.get())
                .unlockedBy("has_material ", has(Items.TUFF))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.GRANITE, 4)
                .requires(ModBlocks.IV_GRANITO.get())
                .unlockedBy("has_material ", has(Items.GRANITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.DIORITE, 4)
                .requires(ModBlocks.IV_DIORITO.get())
                .unlockedBy("has_material ", has(Items.DIORITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.ANDESITE, 4)
                .requires(ModBlocks.IV_ARDESITO.get())
                .unlockedBy("has_material ", has(Items.ANDESITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.CALCITE, 4)
                .requires(ModBlocks.IV_CALCITA.get())
                .unlockedBy("has_material ", has(Items.CALCITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.DIRT, 4)
                .requires(ModBlocks.IV_TERRA.get())
                .unlockedBy("has_material ", has(Items.DIRT))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.SAND, 4)
                .requires(ModBlocks.IV_AREIA.get())
                .unlockedBy("has_material ", has(Items.SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.RED_SAND, 4)
                .requires(ModBlocks.IV_AREIA_VERMELHA.get())
                .unlockedBy("has_material ", has(Items.RED_SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.GRAVEL, 4)
                .requires(ModBlocks.IV_CASCALHO.get())
                .unlockedBy("has_material ", has(Items.GRAVEL))
                .save(consumer);




        //Blocos
        //---Shaped
        //---Shapeless
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_DE_BATATA.get())
                .requires(Items.POTATO, 9)
                .unlockedBy("has_material ", has(Items.POTATO))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_PEDREGULHO.get())
                .requires(Items.COBBLESTONE, 4)
                .unlockedBy("has_material ", has(Items.COBBLESTONE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_PEDREGULHO_ARDOSIA.get())
                .requires(Items.COBBLED_DEEPSLATE, 4)
                .unlockedBy("has_material ", has(Items.COBBLED_DEEPSLATE))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_TUFO.get())
                .requires(Items.TUFF, 4)
                .unlockedBy("has_material ", has(Items.TUFF))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_GRANITO.get())
                .requires(Items.GRANITE, 4)
                .unlockedBy("has_material ", has(Items.GRANITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_DIORITO.get())
                .requires(Items.DIORITE, 4)
                .unlockedBy("has_material ", has(Items.DIORITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_ARDESITO.get())
                .requires(Items.ANDESITE, 4)
                .unlockedBy("has_material ", has(Items.ANDESITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_CALCITA.get())
                .requires(Items.CALCITE, 4)
                .unlockedBy("has_material ", has(Items.CALCITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_TERRA.get())
                .requires(Items.DIRT, 4)
                .unlockedBy("has_material ", has(Items.DIRT))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_AREIA.get())
                .requires(Items.SAND, 4)
                .unlockedBy("has_material ", has(Items.SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_AREIA_VERMELHA.get())
                .requires(Items.RED_SAND, 4)
                .unlockedBy("has_material ", has(Items.RED_SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.IV_CASCALHO.get())
                .requires(Items.GRAVEL, 4)
                .unlockedBy("has_material ", has(Items.GRAVEL))
                .save(consumer);

    }
}
