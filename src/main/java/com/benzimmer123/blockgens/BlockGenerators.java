package com.benzimmer123.blockgens;

import com.benzimmer123.blockgens.managers.GeneratorManager;

public class BlockGenerators {

	private static final BlockGenerators instance = new BlockGenerators();
	private static final GeneratorManager generatorManager = new GeneratorManager();

	public static BlockGenerators getInstance() {
		return instance;
	}

	public GeneratorManager getGeneratorManager() {
		return generatorManager;
	}

}