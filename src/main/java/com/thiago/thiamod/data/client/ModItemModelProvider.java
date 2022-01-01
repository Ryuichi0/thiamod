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
        withExistingParent("bloco_pedregulho_compactado", modLoc("block/bloco_pedregulho_compactado"));
        withExistingParent("bloco_pedregulho_ardosia_compactado", modLoc("block/bloco_pedregulho_ardosia_compactado"));
        withExistingParent("bloco_tufo_compactado", modLoc("block/bloco_tufo_compactado"));
        withExistingParent("bloco_granito_compactado", modLoc("block/bloco_granito_compactado"));
        withExistingParent("bloco_diorito_compactado", modLoc("block/bloco_diorito_compactado"));
        withExistingParent("bloco_ardesito_compactado", modLoc("block/bloco_ardesito_compactado"));
        withExistingParent("bloco_calcita_compactado", modLoc("block/bloco_calcita_compactado"));
        withExistingParent("bloco_terra_compactado", modLoc("block/bloco_terra_compactado"));
        withExistingParent("bloco_areia_compactado", modLoc("block/bloco_areia_compactado"));
        withExistingParent("bloco_areia_vermelha_compactado", modLoc("block/bloco_areia_vermelha_compactado"));
        withExistingParent("bloco_cascalho_compactado", modLoc("block/bloco_cascalho_compactado"));


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
