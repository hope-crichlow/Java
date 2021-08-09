package com.hope.phone;

public class Galaxy extends Phone implements Ringable {
    
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {

    	return "Galaxy " + this.getVersionNumber() + " says " + this.getRingTone();
    }
    
    @Override
    public String unlock() {

    	return "Unlocking via finger print";
    }
    
    @Override
    public void displayInfo() {

    	String brand = "Galaxy ";
		String info = this.getVersionNumber() + " from " + this.getCarrier();
		
		System.out.println(brand + info);
    }
}



