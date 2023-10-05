package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculateUtil3Test {
    @BeforeAll
    public static void before() {
        System.out.println("Start testing CalculateUtil3.java");
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addIfNotNull() {
    }

    @Test
    public void testAddIfNotNull_Null() {
        Integer result = CalculateUtil3.addIfNotNull(null, 50);
        Assertions.assertNull(result);
    }

    @Test
    public void testAddIfNotNull_NotNull() {
        Integer result = CalculateUtil3.addIfNotNull(30, 50);
        Assertions.assertEquals(80, result);
    }

    @AfterAll
    public static void after() {
        System.out.println("Finish testing CalculateUtil3.java");
    }

}