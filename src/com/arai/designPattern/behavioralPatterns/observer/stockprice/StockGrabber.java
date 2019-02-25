/**
 * 
 */
package com.arai.designPattern.behavioralPatterns.observer.stockprice;

import java.util.HashSet;

/**
 * @author Akansh_Rai
 *
 */
public class StockGrabber implements Subject {

	private HashSet<Observer> observers;

	private double ibmPrice;
	private double googPrice;
	private double applPrice;

	public StockGrabber() {
		observers = new HashSet<>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		System.out.println(observer + " : deleted.");
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		observers.forEach(observer -> observer.update(ibmPrice, googPrice, applPrice));
	}

	public void setIBMPrice(double price) {
		this.ibmPrice = price;
		notifyObserver();
	}

	public void setGoogPrice(double price) {
		this.googPrice = price;
		notifyObserver();
	}

	public void setApplePrice(double price) {
		this.applPrice = price;
		notifyObserver();
	}

}
