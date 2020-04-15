/**
 * 
 */
package com.designPattern.structuralPatterns.bridge;

/**
 * @author Akansh_Rai
 *
 */
public abstract class Remote {

	private EntertainmentDevice device;

	public Remote(EntertainmentDevice newDevice) {
		this.device = newDevice;
	}

	public void buttonFivePressed() {
		device.buttonFivePressed();
	}

	public void buttonSixPressed() {
		device.buttonSixPressed();
	}

	public void deviceFeedback() {
		device.deviceFeedback();
	}
	
	public abstract void buttonNinePressed();
}
