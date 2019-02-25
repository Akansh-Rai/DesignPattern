/**
 * 
 */
package com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.impl;

import com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.service.AbstractLogger;
import com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.util.LoggingLevel;

/**
 * @author Akansh_Rai
 *
 */
public class FileLogger extends AbstractLogger {

	private FileLogger() {
	}

	public FileLogger(LoggingLevel level) {
		this.level = level.getValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.
	 * service.LoggerService#write(java.lang.String)
	 */
	@Override
	public void write(String msg) {
		System.out.println("File Logger : " + msg);
	}

}
