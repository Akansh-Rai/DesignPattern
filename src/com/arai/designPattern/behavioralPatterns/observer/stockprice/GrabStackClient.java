/**
 * 
 */
package com.arai.designPattern.behavioralPatterns.observer.stockprice;

/**
 * @author Akansh_Rai
 *
 */
public class GrabStackClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setApplePrice(100);
		stockGrabber.setGoogPrice(200);
		stockGrabber.setIBMPrice(150);
		
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setApplePrice(110);
		stockGrabber.setGoogPrice(220);
		stockGrabber.setIBMPrice(130);
		
		

	}

}
