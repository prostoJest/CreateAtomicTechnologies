package net.examplemod.registry;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.Create;
import net.examplemod.ExampleMod;
import net.examplemod.ExampleModHelpers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ExampleItems {

    public static final CreativeModeTab itemGroup = new CreativeModeTab(ExampleModHelpers.getNextAvailableTabId(), ExampleMod.MOD_ID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return AllBlocks.COGWHEEL.asStack();
        }
    };

    public static void init() {
        ExampleMod.LOGGER.info("Registering items for " + ExampleMod.NAME);
    }
}
