/**
 * 
 */
package com.designPattern.behavioralPatterns.templets;

/**
 * @author Akansh_Rai
 *
 */
public class Client {
	
	public static void main(String[] args) {
		CrossCompiler iPhone = new IPhoneCompiler();
		iPhone.compile();
		CrossCompiler androidPhone = new AndroidPhoneCompiler();
		androidPhone.compile();
	}
	
}
