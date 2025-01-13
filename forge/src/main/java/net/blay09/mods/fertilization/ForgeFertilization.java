package net.blay09.mods.fertilization;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.forge.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Fertilization.MOD_ID)
public class ForgeFertilization {
    public ForgeFertilization(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModEventBus());
        Balm.initialize(Fertilization.MOD_ID, loadContext, Fertilization::initialize);
    }

}
