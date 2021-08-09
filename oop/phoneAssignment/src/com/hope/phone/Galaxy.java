package com.hope.phone;

public class Galaxy extends Phone implements Ringable {
    
	String make = "Galaxy";

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);  
    }
    
    @Override
    public String ring() {
		return make + " " + this.getRing();
    }
    
    @Override
    public String unlock() {
    	return "Unlocking via finger print";
    }
    
    @Override
    public void displayInfo() {
		System.out.println(make + " " + this.getInfo());
    }
}



