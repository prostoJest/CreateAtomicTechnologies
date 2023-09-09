package net.examplemod.fabric.datagen;

import net.examplemod.ExampleMod;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ExampleModData implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        ExistingFileHelper helper = ExistingFileHelper.standard();
        ExampleMod.registrate().setupDatagen(fabricDataGenerator, helper);
    }
}
