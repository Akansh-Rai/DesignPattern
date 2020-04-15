/**
 * 
 */
package com.designPattern.structuralPatterns.decorator;

/**
 * @author Akansh_Rai
 *
 */
public class PizzaMakerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TomatoesPizza tomatoesPizza = new TomatoesPizza(new PlainPizza());
		System.out.println(tomatoesPizza.getIngredients() + "\n" + tomatoesPizza.getPrice());
		
		MargheritaPizza margheritaPizza = new MargheritaPizza(tomatoesPizza);
		
		System.out.println(margheritaPizza.getIngredients() + "\n" + margheritaPizza.getPrice());

	}

}
