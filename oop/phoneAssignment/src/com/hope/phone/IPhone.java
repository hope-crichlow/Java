package com.hope.phone;

public class IPhone extends Phone implements Ringable {
	
	private String brand;
	
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
        
        this.brand = "iPhone";
    }
    
    @Override
    public String ring() {
    	return this.brand + " " + this.getRing();
    }
    
    @Override
    public String unlock() {
    	return "Unlocking via facial recognition";
    }
    
    @Override
    public void displayInfo() {
    	System.out.println(brand + this.getInfo());
    }
}



