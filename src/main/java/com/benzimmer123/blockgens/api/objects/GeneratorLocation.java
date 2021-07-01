package com.benzimmer123.blockgens.api.objects;

import org.bukkit.Location;

public interface GeneratorLocation {

	/**
	 * Method to get the bukkit location
	 * 
	 * @return Location
	 * 
	 */
	Location toLocation();

	/**
	 * Method to get the custom generator associated with this location
	 * 
	 * @return CustomGenerator
	 * 
	 */
	CustomGenerator getGenerator();

}
