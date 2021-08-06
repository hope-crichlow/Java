package com.hope.zookeeper;

public class Gorilla extends Mammal{


//	throwSomething()
	public void throwSomething() {
		System.out.println("The gorilla has thrown something. Energy level has been decreased by 5.");
		this.energyLevel -= 5;
		displayEnergy();		
	}
	
//	eatBananas()
	public void eatBananas() {
		System.out.println("Gorilla loves bananas! Energy level has been increased by 10");
		this.energyLevel += 10;
		displayEnergy();
	}
	
//	climb()
	public void climb() {
		System.out.println("Gorilla has climbed a tree.Energy level has been decreaseed by 10");
		this.energyLevel -= 10;
		displayEnergy();
	}
}
