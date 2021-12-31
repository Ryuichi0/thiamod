package com.thiago.thiamod.data.client;

import com.thiago.thiamod.ThiaMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ThiaMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Blocos
        withExistingParent("bloco_de_batata", modLoc("block/bloco_de_batata"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        //Itens
        builder(itemGenerated, "carvaozinho");
        builder(itemGenerated, "bcoin");
        builder(itemGenerated, "batata_sagrada");
        builder(itemGenerated, "batata_dourada");

        //Ferramentas
        builder(itemGenerated, "picareta_de_bttsa");

        //Armaduras
        builder(itemGenerated, "peitoral_de_bcoin");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
