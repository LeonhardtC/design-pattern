package log;

import log.Logger.Level;

public class Consumer {
	
	public static LoggerWrapper logger;
	
	static {
		ErrorLogger errorLogger = new ErrorLogger();
		WarnLogger warnLogger = new WarnLogger();
		InfoLogger infoLogger = new InfoLogger();
		DebugLogger debugLogger = new DebugLogger();
		errorLogger.setNextLogger(warnLogger);
		warnLogger.setNextLogger(infoLogger);
		infoLogger.setNextLogger(debugLogger);
		logger = new LoggerWrapper(errorLogger, Level.INFO);
	}

	public static void main(String[] args) {
		String msg = "massage need to be marked down";
		
		logger.error(msg);
		System.out.println("--------------------");
		logger.warn(msg);
		System.out.println("--------------------");
		logger.info(msg);
		System.out.println("--------------------");
		logger.debug(msg);
	}
}
