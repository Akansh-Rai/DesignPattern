/**
 * 
 */
package com.designPattern.structuralPatterns.adapter;

import java.util.Random;

/**
 * @author Akansh_Rai
 *
 */
public class EnemyRobot {
	
	private Random generator = new Random();
	
	public void smashWithHand() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot causes " + attackDamage+ " damages with its hand");
	}
	
	public void walkForward() {
		int move = generator.nextInt(5) + 1; 
		System.out.println("Enemy walk on" + move + " moves.");
	}
	
	public void reactToHuman(String name) {
		System.err.println("Enemy robot kills "+ name + " person");
	}

}
