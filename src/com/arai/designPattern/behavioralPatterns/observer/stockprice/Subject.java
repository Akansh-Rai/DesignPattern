/**
 * 
 */
package com.arai.designPattern.behavioralPatterns.observer.stockprice;

/**
 * @author Akansh_Rai
 *
 */
public interface Subject {

	public void register(Observer observer);

	public void unRegister(Observer observer);

	public void notifyObserver();

}
