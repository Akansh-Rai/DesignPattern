/**
 * 
 */
package com.arai.designPattern.behavioralPatterns.observer.stockprice;

/**
 * @author Akansh_Rai
 *
 */
public interface Observer {

	public void update(double ibmPrice, double googPrice, double applPrice);

}
