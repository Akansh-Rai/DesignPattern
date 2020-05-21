/**
 * 
 */
package com.designPattern.creationalPatterns.prototype;

/**
 * @author Akansh_Rai
 *
 */
public class TestCloning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CloneFactory animalMake = new CloneFactory();
		Sheep shally = new Sheep();
		Sheep clonedSheep = (Sheep) animalMake.getClone(shally);
		System.out.println(shally.toString());
		System.out.println("shally hashcode : " + System.identityHashCode(shally));
		System.out.println("clonedSheep hashcode : " + System.identityHashCode(clonedSheep));
	}

}
