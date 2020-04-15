/**
 * 
 */
package com.designPattern.structuralPatterns.bridge;

/**
 * @author Akansh_Rai
 *
 */
public class DVDPlayerRemote extends Remote {

	public DVDPlayerRemote(EntertainmentDevice newDevice) {
		super(newDevice);
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designPattern.structuralPatterns.bridge.Remote#buttonNinePressed()
	 */
	@Override
	public void buttonNinePressed() {
		System.out.println("DVD player was paused");
	}

}
