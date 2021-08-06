package com.hope.zookeeper;


public class Mammal {

	protected int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + this.energyLevel);
		
		return this.energyLevel;
	}
	


}
