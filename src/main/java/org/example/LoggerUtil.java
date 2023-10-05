package org.example;

public class LoggerUtil {

    public static String logOnlyInfo(String tag, String msg) {
        if ("[INFO]".equals(tag)) {
            return tag + msg;
        } else {
            return null;
        }
    }

    public static String logInfoAndDebug(String tag, String msg) {
        if ("[INFO]".equals(tag) || "[DEBUG]".equals(tag)) {
            return tag + msg;
        } else {
            return null;
        }
    }
}