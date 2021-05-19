package com.scrolltest.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    //XML Config file we add format of the logs like TimeStamp or any other info
    //Start Test and End Test logs
    //Custom wrapper of logs

    static {

        String log4jPath = System.getProperty("user.dir")+"/src/main/resources/log4j.xml";
        System.setProperty("logoutputpath", System.getProperty("user.dir"));
        System.setProperty("log4j.configurationfile",log4jPath);

    }

    public static Logger Log = LogManager.getLogger(Log.class.getName());

    public static void startTestcase(String sTestCaseName){
        Log.info("*********** "+ "START TEST" +" *****************");
        Log.info("*********** "+ sTestCaseName +" *****************");
    }

    public static void endTestcase(String sTestCaseName){
        Log.info("*********** "+ "END TEST" +" *****************");
        Log.info("*********** "+ sTestCaseName +" *****************");
    }

    //Log Level Methods

    public static void info(String message){
        Log.info(message);
    }

    public static void warn(String message){
        Log.warn(message);
    }

    public static void error(String message, Exception e){
        Log.error(message, e);
    }

    public static void fatal(String message){
        Log.fatal(message);
    }

}
