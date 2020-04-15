/**
 * 
 */
package com.designPattern.structuralPatterns.bridge;

/**
 * @author Akansh_Rai
 *
 */
public class TVRemote extends Remote {

	public TVRemote(EntertainmentDevice newDevice) {
		super(newDevice);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designPattern.structuralPatterns.bridge.Remote#buttonNinePressed()
	 */
	@Override
	public void buttonNinePressed() {

		System.out.println("Tv is mutted");

	}

}
