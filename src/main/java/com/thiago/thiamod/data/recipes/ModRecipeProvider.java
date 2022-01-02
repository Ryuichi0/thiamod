package com.thiago.thiamod.data.recipes;

import com.thiago.thiamod.ThiaMod;
import com.thiago.thiamod.setup.ModBlocks;
import com.thiago.thiamod.setup.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
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
                .unlockedBy("has_material", has(Items.GOLD_INGOT))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.BATATA_DOURADA.get())
                .define('T', Items.POTATO)
                .define('H', Items.GOLD_INGOT)
                .pattern("HHH")
                .pattern("HTH")
                .pattern("HHH")
                .unlockedBy("has_material", has(Items.POTATO))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.BATATA_SAGRADA.get())
                .define('T', ModBlocks.BLOCO_DE_BATATA.get())
                .define('H', Items.AMETHYST_SHARD)
                .define('I', Items.DIAMOND)
                .pattern("IHI")
                .pattern("HTH")
                .pattern("IHI")
                .unlockedBy("has_material", has(ModBlocks.BLOCO_DE_BATATA.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PICARETA_DE_BTTSA.get())
                .define('T', ModItems.BATATA_SAGRADA.get())
                .define('H', Items.STICK)
                .pattern("TTT")
                .pattern(" H ")
                .pattern(" H ")
                .unlockedBy("has_material", has(ModItems.BATATA_SAGRADA.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.PEITORAL_DE_BCOIN.get())
                .define('T', ModItems.BCOIN.get())
                .define('H', Items.IRON_INGOT)
                .pattern("HTH")
                .pattern("HHH")
                .pattern("HHH")
                .unlockedBy("has_material", has(ModItems.BCOIN.get()))
                .save(consumer);

        //---Shapeless
        ShapelessRecipeBuilder.shapeless(Items.COAL)
                .requires(ModItems.CARVAOZINHO.get(), 8)
                .unlockedBy("has_material", has(ModItems.CARVAOZINHO.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.CARVAOZINHO.get(), 8)
                .requires(Items.COAL)
                .unlockedBy("has_material", has(Items.COAL))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Items.POTATO, 9)
                .requires(ModBlocks.BLOCO_DE_BATATA.get())
                .unlockedBy("has_material", has(Items.POTATO))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Blocks.COBBLESTONE, 8)
                .requires(ModBlocks.VIII_PEDREGULHO.get())
                .unlockedBy("has_material", has(Blocks.COBBLESTONE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Blocks.COBBLED_DEEPSLATE, 8)
                .requires(ModBlocks.VIII_PEDREGULHO_ARDOSIA.get())
                .unlockedBy("has_material", has(Blocks.COBBLED_DEEPSLATE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Blocks.TUFF, 8)
                .requires(ModBlocks.VIII_TUFO.get())
                .unlockedBy("has_material", has(Blocks.TUFF))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Blocks.GRANITE, 8)
                .requires(ModBlocks.VIII_GRANITO.get())
                .unlockedBy("has_material", has(Blocks.GRANITE))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(Blocks.DIORITE, 8)
                .requires(ModBlocks.VIII_DIORITO.get())
                .unlockedBy("has_material", has(Blocks.DIORITE))
                .save(consumer, ThiaMod.MODID + ":diorito");
        ShapelessRecipeBuilder.shapeless(Blocks.ANDESITE, 8)
                .requires(ModBlocks.VIII_ARDESITO.get())
                .unlockedBy("has_material", has(Blocks.ANDESITE))
                .save(consumer, ThiaMod.MODID + ":ardesito");

        ShapelessRecipeBuilder.shapeless(Blocks.CALCITE, 8)
                .requires(ModBlocks.VIII_CALCITA.get())
                .unlockedBy("has_material", has(Blocks.CALCITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Blocks.DIRT, 8)
                .requires(ModBlocks.VIII_TERRA.get())
                .unlockedBy("has_material", has(Blocks.DIRT))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Blocks.SAND, 8)
                .requires(ModBlocks.VIII_AREIA.get())
                .unlockedBy("has_material", has(Blocks.SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Blocks.RED_SAND, 8)
                .requires(ModBlocks.VIII_AREIA_VERMELHA.get())
                .unlockedBy("has_material", has(Blocks.RED_SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Blocks.GRAVEL, 8)
                .requires(ModBlocks.VIII_CASCALHO.get())
                .unlockedBy("has_material", has(Blocks.GRAVEL))
                .save(consumer);




        //Blocos
        //---Shaped
        //---Shapeless
        ShapelessRecipeBuilder.shapeless(ModBlocks.BLOCO_DE_BATATA.get())
                .requires(Items.POTATO, 9)
                .unlockedBy("has_material", has(Items.POTATO))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_PEDREGULHO.get())
                .requires(Blocks.COBBLESTONE, 8)
                .unlockedBy("has_material", has(Blocks.COBBLESTONE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_PEDREGULHO_ARDOSIA.get())
                .requires(Blocks.COBBLED_DEEPSLATE, 8)
                .unlockedBy("has_material", has(Blocks.COBBLED_DEEPSLATE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_TUFO.get())
                .requires(Blocks.TUFF, 8)
                .unlockedBy("has_material", has(Blocks.TUFF))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_GRANITO.get())
                .requires(Blocks.GRANITE, 8)
                .unlockedBy("has_material", has(Blocks.GRANITE))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_DIORITO.get())
                .requires(Blocks.DIORITE, 8)
                .unlockedBy("has_material", has(Blocks.DIORITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_ARDESITO.get())
                .requires(Blocks.ANDESITE, 8)
                .unlockedBy("has_material", has(Blocks.ANDESITE))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_CALCITA.get())
                .requires(Blocks.CALCITE, 8)
                .unlockedBy("has_material", has(Blocks.CALCITE))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_TERRA.get())
                .requires(Blocks.DIRT, 8)
                .unlockedBy("has_material", has(Blocks.DIRT))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_AREIA.get())
                .requires(Blocks.SAND, 8)
                .unlockedBy("has_material", has(Blocks.SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_AREIA_VERMELHA.get())
                .requires(Blocks.RED_SAND, 8)
                .unlockedBy("has_material", has(Blocks.RED_SAND))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.VIII_CASCALHO.get())
                .requires(Blocks.GRAVEL, 8)
                .unlockedBy("has_material", has(Blocks.GRAVEL))
                .save(consumer);

    }
}
