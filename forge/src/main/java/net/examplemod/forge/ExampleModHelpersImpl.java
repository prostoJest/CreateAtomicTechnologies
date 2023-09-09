package net.examplemod.forge;

import net.minecraft.world.item.CreativeModeTab;

public class ExampleModHelpersImpl {
    public static int getNextAvailableTabId() {
        return CreativeModeTab.getGroupCountSafe();
    }
}
