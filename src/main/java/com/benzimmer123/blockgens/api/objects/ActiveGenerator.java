package com.benzimmer123.blockgens.api.objects;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;

public interface ActiveGenerator {

	/**
	 * Method to get the player uuid of active generator
	 * 
	 * @return UUID
	 * 
	 */
	UUID getUUID();

	/**
	 * Method to get a list of all GeneratorLocations from active generator
	 * 
	 * @return List of GeneratorLocations
	 * 
	 */
	List<GeneratorLocation> getGenerators();

	/**
	 * Method to add another generator to this active generator
	 * 
	 * @param Location location
	 * @param CustomGenerator generator
	 * 
	 */
	void addGenerator(Location location, CustomGenerator generator);

	/**
	 * Method to get a list of all GeneratorLocations from active generator
	 * 
	 * @param Location location
	 * 
	 */
	void removeGenerator(Location location);

}