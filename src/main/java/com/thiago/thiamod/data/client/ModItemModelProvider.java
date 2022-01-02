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
        withExistingParent("8x_pedregulho", modLoc("block/8x_pedregulho"));
        withExistingParent("8x_pedregulho_ardosia", modLoc("block/8x_pedregulho_ardosia"));
        withExistingParent("8x_tufo", modLoc("block/8x_tufo"));
        withExistingParent("8x_granito", modLoc("block/8x_granito"));
        withExistingParent("8x_diorito", modLoc("block/8x_diorito"));
        withExistingParent("8x_ardesito", modLoc("block/8x_ardesito"));
        withExistingParent("8x_calcita", modLoc("block/8x_calcita"));
        withExistingParent("8x_terra", modLoc("block/8x_terra"));
        withExistingParent("8x_areia", modLoc("block/8x_areia"));
        withExistingParent("8x_areia_vermelha", modLoc("block/8x_areia_vermelha"));
        withExistingParent("8x_cascalho", modLoc("block/8x_cascalho"));


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
