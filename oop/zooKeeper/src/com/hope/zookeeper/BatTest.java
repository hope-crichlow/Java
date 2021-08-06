package com.hope.zookeeper;

public class BatTest {

	public static void main(String[] args) {

		Bat b = new Bat();
// TEST CASES
//		System.out.println("Starting " + b.displayEnergy());
		
		System.out.println("----- Attack Town Test ------");
//		Attack 3 towns		
		for(int i=0; i<3;i++) {
			b.attackTown();
		}
		
		System.out.println("----- Eat Humans Test ------");
//		Eat 2 humans
		for(int i=0; i<2; i ++){
			b.eatHumans();
		}
		
		System.out.println("----- Fly Test ------");
//		Fly 2 times
		for(int i=0; i<2; i ++){
			b.fly();
		}
		
	}
}
