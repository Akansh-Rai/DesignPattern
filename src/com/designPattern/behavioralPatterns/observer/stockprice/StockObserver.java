/**
 * 
 */
package com.designPattern.behavioralPatterns.observer.stockprice;

/**
 * @author Akansh_Rai
 *
 */
public class StockObserver implements Observer {

	private double ibmPrice;
	private double googPrice;
	private double applPrice;

	private static int observerIdTracker = 0;

	private int observerID;

	private Subject subject;

	public StockObserver(Subject subject) {

		this.subject = subject;

		this.observerID = ++observerIdTracker;

		System.out.println("New Observer Id : " + observerID);

		this.subject.register(this);
	}

	@Override
	public void update(double ibmPrice, double googPrice, double applPrice) {
		this.ibmPrice = ibmPrice;
		this.googPrice = googPrice;
		this.applPrice = applPrice;

		printAll();
	}

	private void printAll() {
		System.out.println(this.observerID);

		System.out.println("IBM Price : " + ibmPrice);

		System.out.println("Google Price : " + googPrice);

		System.out.println("Apple Price : " + applPrice);

	}

}
