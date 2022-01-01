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
        ShapelessRecipeBuilder.shapeless(Items.COBBLESTONE, 9)
                .requires(ModBlocks.BLOCO_PEDREGULHO_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.COBBLESTONE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.COBBLED_DEEPSLATE, 9)
                .requires(ModBlocks.BLOCO_PEDREGULHO_ARDOSIA_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.COBBLED_DEEPSLATE))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(Items.TUFF, 9)
                .requires(ModBlocks.BLOCO_TUFO_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.TUFF))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.GRANITE, 9)
                .requires(ModBlocks.BLOCO_GRANITO_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.GRANITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.DIORITE, 9)
                .requires(ModBlocks.BLOCO_DIORITO_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.DIORITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.ANDESITE, 9)
                .requires(ModBlocks.BLOCO_ARDESITO_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.ANDESITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.CALCITE, 9)
                .requires(ModBlocks.BLOCO_CALCITA_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.CALCITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.DIRT, 9)
                .requires(ModBlocks.BLOCO_TERRA_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.DIRT))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.SAND, 9)
                .requires(ModBlocks.BLOCO_AREIA_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.RED_SAND, 9)
                .requires(ModBlocks.BLOCO_AREIA_VERMELHA_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.RED_SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.GRAVEL, 9)
                .requires(ModBlocks.BLOCO_CASCALHO_COMPACTADO.get())
                .unlockedBy("has_material ", has(Items.GRAVEL))
                .save(consumer);




        //Blocos
        //---Shaped
        //---Shapeless
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_DE_BATATA.get())
                .requires(Items.POTATO, 9)
                .unlockedBy("has_material ", has(Items.POTATO))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_PEDREGULHO_COMPACTADO.get())
                .requires(Items.COBBLESTONE, 9)
                .unlockedBy("has_material ", has(Items.COBBLESTONE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_PEDREGULHO_ARDOSIA_COMPACTADO.get())
                .requires(Items.COBBLED_DEEPSLATE, 9)
                .unlockedBy("has_material ", has(Items.COBBLED_DEEPSLATE))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_TUFO_COMPACTADO.get())
                .requires(Items.TUFF, 9)
                .unlockedBy("has_material ", has(Items.TUFF))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_GRANITO_COMPACTADO.get())
                .requires(Items.GRANITE, 9)
                .unlockedBy("has_material ", has(Items.GRANITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_DIORITO_COMPACTADO.get())
                .requires(Items.DIORITE, 9)
                .unlockedBy("has_material ", has(Items.DIORITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_ARDESITO_COMPACTADO.get())
                .requires(Items.ANDESITE, 9)
                .unlockedBy("has_material ", has(Items.ANDESITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_CALCITA_COMPACTADO.get())
                .requires(Items.CALCITE, 9)
                .unlockedBy("has_material ", has(Items.CALCITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_TERRA_COMPACTADO.get())
                .requires(Items.DIRT, 9)
                .unlockedBy("has_material ", has(Items.DIRT))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_AREIA_COMPACTADO.get())
                .requires(Items.SAND, 9)
                .unlockedBy("has_material ", has(Items.SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_AREIA_VERMELHA_COMPACTADO.get())
                .requires(Items.RED_SAND, 9)
                .unlockedBy("has_material ", has(Items.RED_SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_CASCALHO_COMPACTADO.get())
                .requires(Items.GRAVEL, 9)
                .unlockedBy("has_material ", has(Items.GRAVEL))
                .save(consumer);

    }
}
