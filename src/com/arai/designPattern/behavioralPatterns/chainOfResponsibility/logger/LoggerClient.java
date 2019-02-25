/**
 * 
 */
package com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger;

import com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.impl.ConsoleLogger;
import com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.impl.ErrorLogger;
import com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.impl.FileLogger;
import com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.service.LoggerService;
import com.arai.designPattern.behavioralPatterns.chainOfResponsibility.logger.util.LoggingLevel;

/**
 * @author Akansh_Rai
 *
 */
public class LoggerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LoggerService logger = getLoggerChain();
		
		logger.logMessage(LoggingLevel.INFO, "Log msg in info level");
		logger.logMessage(LoggingLevel.WARNING, "Log msg in Warning level");
		logger.logMessage(LoggingLevel.ERROR, "Log msg in Error level");
		//logger.logMessage(0, "--no correct level--");
	}

	/*
	 * Simple logger chain builder.
	 * We can use any other Design pattern to simplify or automate this.
	 */
	private static LoggerService getLoggerChain() {
		ConsoleLogger consoleLogger = new ConsoleLogger(LoggingLevel.WARNING);
		FileLogger fileLogger = new FileLogger(LoggingLevel.INFO);
		ErrorLogger errorLogger = new ErrorLogger(LoggingLevel.ERROR);
		consoleLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(errorLogger);
		return consoleLogger;
	}

}
