package com.hope.phone;

public interface Ringable {
//	Create a Ringable interface that contains the following methods:

//ring(): This method returns a String.
	default String ring() {
		return "Ringgg";
	}
//unlock(): This method returns a String.
	default String unlock() {
		return "Phone has been unlocked";
	}
}
