package net.examplemod.forge;

import net.examplemod.registry.ExampleBlocks;
import net.examplemod.ExampleMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleMod.registrate().registerEventListeners(eventBus);
        ExampleMod.init();

        eventBus.addListener(EventPriority.LOWEST, ExampleModForge::gatherData);
    }


    public static void gatherData(GatherDataEvent event) {
        // Add data generators here
        DataGenerator gen = event.getGenerator();
    }
}
