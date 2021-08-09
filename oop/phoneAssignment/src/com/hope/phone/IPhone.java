package com.hope.phone;

public class IPhone extends Phone implements Ringable {
	
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
        // your code here
    	return "iPhone " + this.getVersionNumber() + " says " + this.getRingTone();
    }
    
    @Override
    public String unlock() {
        // your code here
    	return "Unlocking via facial recognition";
    }
    
    @Override
    public void displayInfo() {
        // your code here 
    	String brand = "iPhone ";
    	String info = this.getVersionNumber() + " from " + this.getCarrier();
    	System.out.println(brand + info);
    }
}



