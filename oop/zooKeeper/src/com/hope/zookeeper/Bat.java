package com.hope.zookeeper;

public class Bat extends Mammal{

	public Bat() {
	
		this.energyLevel = 300;
	}
	
//	fly()
	public void fly() {
		System.out.println("Bat has taken to the sky! Energy level has been decreased by 50");
		this.energyLevel -= 50;
		displayEnergy();
	}
//	eatHumans()
	public void eatHumans() {
		System.out.println("Just a nibble... Energy level has been increased by 25");
		this.energyLevel += 25;
		displayEnergy();
		
	}
//	attackTown()
	public void attackTown() {
		System.out.println("*Sounds of Fire and Mayhem* Energy level has been decreased by 100");
		this.energyLevel -= 100;
		displayEnergy();
	}
}
