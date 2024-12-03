package net.blay09.mods.fertilization.fabric.datagen;

import net.blay09.mods.fertilization.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ModItems.compressedBoneMeal, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.extremelyCompressedBoneMeal, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.floristsBoneMeal, ModelTemplates.FLAT_ITEM);
    }
}
