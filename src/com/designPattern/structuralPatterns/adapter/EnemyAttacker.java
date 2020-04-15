/**
 * 
 */
package com.designPattern.structuralPatterns.adapter;

/**
 * @author Akansh_Rai
 *
 */
public interface EnemyAttacker {
	
	public void fireWeapon();

	public void driveForward();

	public void assignDriver(String name);
}
