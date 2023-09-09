package net.examplemod.fabric;

import io.github.fabricators_of_create.porting_lib.util.ItemGroupUtil;

public class ExampleModHelpersImpl {
    public static int getNextAvailableTabId() {
        return ItemGroupUtil.expandArrayAndGetId();
    }
}
