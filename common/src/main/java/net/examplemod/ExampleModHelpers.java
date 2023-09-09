package net.examplemod;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class ExampleModHelpers {
    @ExpectPlatform
    public static int getNextAvailableTabId() {
        throw new AssertionError();
    }
}
