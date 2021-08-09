package com.hope.phone;

public class IPhone extends Phone implements Ringable {
	
	String make = "iPhone";
	
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
 
    }
    
    @Override
    public String ring() {
    	return make + " " + this.getRing();
    }
    
    @Override
    public String unlock() {
    	return "Unlocking via facial recognition";
    }
    
    @Override
    public void displayInfo() {
    	System.out.println(make + " " + this.getInfo());
    }
}



