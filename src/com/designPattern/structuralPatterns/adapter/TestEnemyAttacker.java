/**
 * 
 */
package com.designPattern.structuralPatterns.adapter;

/**
 * @author Akansh_Rai
 *
 */
public class TestEnemyAttacker {
	public static void main(String[] args) {
		EnemyRobot robot = new EnemyRobot();
		EnemyTankAdapter tank = new EnemyTankAdapter(robot);

		tank.assignDriver("Akansh");
		tank.driveForward();
		tank.fireWeapon();
	}
}
