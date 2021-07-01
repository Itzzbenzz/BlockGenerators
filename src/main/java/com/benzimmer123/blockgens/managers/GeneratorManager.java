package com.benzimmer123.blockgens.managers;

import org.bukkit.entity.Player;

import com.benzimmer123.blockgens.api.objects.CustomGenerator;

public class GeneratorManager {

	/**
	 * Method to get the custom generator in a players hand
	 * 
	 * @param Player player
	 * @return CustomGenerator
	 * 
	 */
	public CustomGenerator getGeneratorInHand(Player player) {
		return null;
	}

	/**
	 * Method to get the custom generator from a string
	 * 
	 * @param String name
	 * @return CustomGenerator
	 * 
	 */
	public CustomGenerator getGeneratorByString(String name) {
		return null;
	}

	/**
	 * Method to check if a player has an active generator file
	 * 
	 * @param Player player
	 * @return boolean
	 * 
	 */
	public boolean hasGeneratorFile(Player player) {
		return false;
	}

	/**
	 * Method to remove a players active generator file
	 * 
	 * @param Player player
	 * 
	 */
	public void removeGeneratorFile(Player player) {
	}

}
