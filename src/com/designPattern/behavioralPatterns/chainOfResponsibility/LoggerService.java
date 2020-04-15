/**
 * 
 */
package com.designPattern.behavioralPatterns.chainOfResponsibility;

/**
 * @author Akansh_Rai
 *
 */
public interface LoggerService {

	public void logMessage(LoggingLevel level, String msg);

	public void setNextLogger(LoggerService service);

	public abstract void write(String msg);

}
