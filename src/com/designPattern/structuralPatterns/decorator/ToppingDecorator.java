/**
 * 
 */
package com.designPattern.structuralPatterns.decorator;

/**
 * @author Akansh_Rai
 *
 */
public class ToppingDecorator implements Pizza {
	
	protected Pizza pizza;
	
	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	/* (non-Javadoc)
	 * @see com.arai.designPattern.structuralPatterns.decorator.Pizza#getIngredients()
	 */
	@Override
	public String getIngredients() {
		return pizza.getIngredients();
	}

	/* (non-Javadoc)
	 * @see com.arai.designPattern.structuralPatterns.decorator.Pizza#getPrice()
	 */
	@Override
	public double getPrice() {
		return pizza.getPrice();
	}

}
