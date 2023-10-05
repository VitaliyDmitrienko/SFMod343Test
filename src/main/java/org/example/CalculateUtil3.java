package org.example;

public class CalculateUtil3 {

    private static boolean isAnyNull(Integer a, Integer b) {
        return null == a || null == b;
    }

    public static Integer addIfNotNull(Integer a, Integer b) {
        if (isAnyNull(a, b)) {
            return null;
        }
        return a + b;
    }
}