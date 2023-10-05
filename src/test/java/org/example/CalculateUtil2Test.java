package org.example;

import org.example.CalculateUtil2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateUtil2Test {

    @Test
    public void testConcatAndTrim() {
        String result = CalculateUtil2.concatAndTrim(" first ", "second ");
        Assertions.assertEquals("first second", result);
        result = CalculateUtil2.concatAndTrim(null, "second ");
        Assertions.assertNull(result);
    }
}