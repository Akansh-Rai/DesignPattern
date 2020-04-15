/**
 * 
 */
package com.designPattern.structuralPatterns.bridge;

/**
 * @author Akansh_Rai
 *
 */
public abstract class EntertainmentDevice {

	public int devideState;

	public int maxSetting;

	public int volumnLevel = 0;

	public abstract void buttonFivePressed();

	public abstract void buttonSixPressed();

	public void deviceFeedback() {
		if (devideState > maxSetting || devideState < 0) {
			devideState = 0;
			System.out.println("On  " + devideState);
		}
	}

	public void buttonSevenPressed() {
		System.out.println("Volumn at " + ++volumnLevel);
	}

	public void buttonEightPressed() {
		System.out.println("Volumn at " + --volumnLevel);
	}
}
