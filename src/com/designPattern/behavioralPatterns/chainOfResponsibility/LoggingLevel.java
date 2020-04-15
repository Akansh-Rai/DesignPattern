/**
 * 
 */
package com.designPattern.behavioralPatterns.chainOfResponsibility;

/**
 * @author Akansh_Rai
 *
 */
public enum LoggingLevel {
	INFO(1),WARNING(2),ERROR(3);
	int value;
	LoggingLevel(int i) {
		this.value = i;
	}
	public int getValue() {
		return this.value;
	}
}
