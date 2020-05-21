/**
 * 
 */
package com.designPattern.structuralPatterns.adapter;

/**
 * @author Akansh_Rai
 *
 */
public class EnemyTankAdapter implements EnemyAttacker {

	EnemyRobot robot;

	public EnemyTankAdapter(EnemyRobot robot) {
		this.robot = robot;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designPattern.structuralPatterns.adapter.EnemyAttacker#fireWeapon()
	 */
	@Override
	public void fireWeapon() {
		robot.smashWithHand();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.designPattern.structuralPatterns.adapter.EnemyAttacker#driveForward()
	 */
	@Override
	public void driveForward() {
		robot.walkForward();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.designPattern.structuralPatterns.adapter.EnemyAttacker#assignDriver(java.
	 * lang.String)
	 */
	@Override
	public void assignDriver(String name) {
		robot.reactToHuman(name);
	}

}
