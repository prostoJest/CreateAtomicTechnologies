package net.examplemod.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.examplemod.ExampleMod;
import net.minecraft.world.level.block.Block;

public class ExampleBlocks {
	private static final CreateRegistrate REGISTRATE = ExampleMod.registrate();
	public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new).register();

	public static void init() {
		// load the class and register everything
		ExampleMod.LOGGER.info("Registering blocks for " + ExampleMod.NAME);
	}
}
