/**
 * 
 */
package com.designPattern.behavioralPatterns.chainOfResponsibility;

/**
 * @author Akansh_Rai
 *
 */
public abstract class AbstractLogger implements LoggerService {

	protected int level;

	protected LoggerService nextLogger;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.
	 * LoggerService#logMessage(int, java.lang.String)
	 */
	@Override
	public void logMessage(LoggingLevel level, String msg) {
		if (this.level <= level.getValue()) {
			this.write(msg);
		}
		
		if (nextLogger != null) {
			nextLogger.logMessage(level, msg);
		} 

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.
	 * LoggerService#setNextLogger(com.arai.designPattern.behavioralPatterns.
	 * chainOfResponsibility.logger.LoggerService)
	 */
	@Override
	public void setNextLogger(LoggerService logger) {
		this.nextLogger = logger;
	}

}
