/**
 * 
 */
package com.designPattern.creationalPatterns.prototype;

/**
 * @author Akansh_Rai
 *
 */
public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep is made");
	}

	public Animal makeCopy() {

		try {
			System.out.println("Sheep is being made");
			Sheep sheep = null;
			sheep = (Sheep) super.clone();
			return sheep;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String toString() {
		return "Dolly is my hero";
	}
}
