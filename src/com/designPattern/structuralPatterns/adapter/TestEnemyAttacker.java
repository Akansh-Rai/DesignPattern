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
		EnemyTank enemyTank= new EnemyTank();
		
		EnemyRobot robot = new EnemyRobot();
		
		EnemyRobotAdapter roboAdapter = new EnemyRobotAdapter(robot);
		
		roboAdapter.assignDriver("Akansh");
		roboAdapter.driveForward();
		roboAdapter.fireWeapon();
		
		
	}
}
