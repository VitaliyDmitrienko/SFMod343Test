package org.example;

public class CalculateUtil2 {

    public static String concatAndTrim(String a, String b) {
        if (null == a || null == b) {
            return null;
        }
        return (a + b).trim();
    }
}