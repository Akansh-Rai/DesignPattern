/**
 * 
 */
package com.designPattern.structuralPatterns.decorator;

/**
 * @author Akansh_Rai
 *
 */
public class MargheritaPizza extends ToppingDecorator {
	
	
	public MargheritaPizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getIngredients() {
		return " Margherita, sliced mozzarella, basil, and extra virgin olive oil." + pizza.getIngredients();		
	}

	@Override
	public double getPrice() {
		return 60 + pizza.getPrice();
	}
	

}
