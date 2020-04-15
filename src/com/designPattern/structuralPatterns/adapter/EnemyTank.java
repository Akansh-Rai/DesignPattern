/**
 * 
 */
package com.designPattern.structuralPatterns.adapter;

import java.util.Random;

/**
 * @author Akansh_Rai
 *
 */
public class EnemyTank implements EnemyAttacker {

	private Random generator = new Random();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designPattern.structuralPatterns.adapter.EnemyAttacker#fireWeapon()
	 */
	@Override
	public void fireWeapon() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Tank does " + attackDamage + " Damage");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.designPattern.structuralPatterns.adapter.EnemyAttacker#driveForward()
	 */
	@Override
	public void driveForward() {
		int movement = generator.nextInt(5)	+1;
		System.out.println("Enemy Tank Moves " + movement + " space");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.designPattern.structuralPatterns.adapter.EnemyAttacker#assignDriver()
	 */
	@Override
	public void assignDriver(String name) {
		System.out.println("Driver name is " + name);
	}

}
