package com.hope.phone;

public abstract class Phone {
//	private String brand;
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
//    	this.brand = brand;
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
//  Abstract Method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    
//  Getters and Setters

    public String getVersionNumber() {
    	return this.versionNumber;
    }
    
    public void setVersionNumber(String newVersionNumber) {
    	this.versionNumber = newVersionNumber;
    }
    
    
    public int getBatteryPercentage() {
    	return this.batteryPercentage;
    }
    
    public void setBatteryPercentage(int newBatteryPercentage) {
    	this.batteryPercentage = newBatteryPercentage;
    }
    
    
    public String getCarrier() {
    	return this.carrier;
    }
    
    public void setCarrier(String newCarrier) {
    	this.carrier = newCarrier;
    }
    
    
    public String getRingTone() {
    	return this.ringTone;
    }
    
    public void setRingTone(String newRingTone) {
    	this.ringTone = newRingTone;
    }
    
    
    public String getInfo() {
    	return this.getVersionNumber() + " from " + this.getCarrier();
    }
    
    
    public String getRing() {
    	return this.getVersionNumber() + " says " + this.getRingTone();
    }
}
