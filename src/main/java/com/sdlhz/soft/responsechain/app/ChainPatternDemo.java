package com.sdlhz.soft.responsechain.app;

import com.sdlhz.soft.responsechain.objs.AbstractLogger;
import com.sdlhz.soft.responsechain.objs.ConsoleLogger;
import com.sdlhz.soft.responsechain.objs.ErrorLogger;
import com.sdlhz.soft.responsechain.objs.FileLogger;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        System.out.println("===============================================");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");
        System.out.println("===============================================");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}