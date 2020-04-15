/**
 * 
 */
package com.designPattern.structuralPatterns.decorator;

/**
 * @author Akansh_Rai
 *
 */
public class TomatoesPizza extends ToppingDecorator {

	public TomatoesPizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngredients() {
		return " tomato " + pizza.getIngredients();
	}

	@Override
	public double getPrice() {
		return 20 + pizza.getPrice();
	}
}
