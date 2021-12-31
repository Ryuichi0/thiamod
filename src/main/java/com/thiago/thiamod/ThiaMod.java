package com.thiago.thiamod;

import com.thiago.thiamod.data.DataGenerators;
import com.thiago.thiamod.setup.ModItems;
import com.thiago.thiamod.setup.Registration;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ThiaMod.MODID)
public class ThiaMod {
    public static final String MODID = "thiamod";
    private static final Logger LOGGER = LogManager.getLogger();

    public ThiaMod(){
        Registration.register();
    }

    public static final CreativeModeTab THIAMOD_TAB = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CARVAOZINHO.get());
        }
    };
}
