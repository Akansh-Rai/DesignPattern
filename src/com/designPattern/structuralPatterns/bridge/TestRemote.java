/**
 * 
 */
package com.designPattern.structuralPatterns.bridge;

/**
 * @author Akansh_Rai
 *
 */
public class TestRemote {
	
	public static void main(String[] args) {
		Remote tv1 = new TVRemote(new TVDevice(1, 200));
		Remote tv2 = new TVRemote(new TVDevice(1, 10));
		
		System.out.println("Television");
		tv1.buttonFivePressed();
		tv1.buttonNinePressed();
		tv1.buttonSixPressed();
		tv1.deviceFeedback();
		
		Remote dvd1 = new DVDPlayerRemote(new TVDevice(1, 200));
		System.out.println("DVD");
		dvd1.buttonFivePressed();
		dvd1.buttonNinePressed();
		dvd1.buttonSixPressed();
		dvd1.buttonSixPressed();
		dvd1.buttonSixPressed();
		dvd1.buttonSixPressed();
		dvd1.buttonSixPressed();
		dvd1.deviceFeedback();
		
	}

}
