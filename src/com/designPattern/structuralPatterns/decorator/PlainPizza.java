/**
 * 
 */
package com.designPattern.structuralPatterns.decorator;

/**
 * @author Akansh_Rai
 *
 */
public class PlainPizza implements Pizza {

	@Override
	public String getIngredients() {
		return "Thin Dough";
	}

	@Override
	public double getPrice() {
		return 50.00;
	}

}
