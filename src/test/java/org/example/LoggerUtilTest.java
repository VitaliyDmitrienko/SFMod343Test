package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoggerUtilTest {

    @Test
    public void testLogOnlyInfo() {
        String infoTag = "[INFO]";
        String debugTag = "[DEBUG]";
        String logMessage = LoggerUtil.logOnlyInfo(debugTag, " happened");
        Assertions.assertNull(logMessage);
        logMessage = LoggerUtil.logOnlyInfo(infoTag, " happened");
        Assertions.assertEquals("[INFO] happened", logMessage);
    }

    @Test
    public void testLogInfoAndDebug() {
        String infoTag = "[INFO]";
        String debugTag = "[DEBUG]";
        String logMessage = LoggerUtil.logInfoAndDebug(debugTag, " happened");
        Assertions.assertEquals("[DEBUG] happened", logMessage);
        logMessage = LoggerUtil.logInfoAndDebug(infoTag, " happened");
        Assertions.assertEquals("[INFO] happened", logMessage);
    }
}