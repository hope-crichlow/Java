package com.hope.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {

		Gorilla g = new Gorilla();
		
// TEST CASES 
		System.out.println(g.displayEnergy());
		
		System.out.println("----- Throw Something Test -----");
		
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		
		System.out.println("----- Eat Bananas Test -----");
		
		g.eatBananas();
		g.eatBananas();
		
		System.out.println("----- Climb Test -----");
		
		g.climb();
	}

}
