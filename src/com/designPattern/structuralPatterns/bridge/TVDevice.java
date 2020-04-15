/**
 * 
 */
package com.designPattern.structuralPatterns.bridge;

/**
 * @author Akansh_Rai
 *
 */
public class TVDevice extends EntertainmentDevice {

	public TVDevice(int state, int _maxSetting) {
		devideState = state;
		maxSetting = _maxSetting;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designPattern.structuralPatterns.bridge.EntertainmentDevice#
	 * buttonFivePressed()
	 */
	@Override
	public void buttonFivePressed() {
		System.out.println("Channel down");
		devideState--;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designPattern.structuralPatterns.bridge.EntertainmentDevice#
	 * buttonSixPressed()
	 */
	@Override
	public void buttonSixPressed() {
		System.out.println("Channel Up");
		devideState++;
	}

}
