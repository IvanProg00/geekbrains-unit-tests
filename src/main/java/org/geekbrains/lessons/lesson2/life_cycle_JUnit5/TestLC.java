package org.geekbrains.lessons.lesson2.life_cycle_JUnit5;

import org.junit.jupiter.api.*;

public class TestLC {
    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll");
    }

    @AfterAll
    static void tear() {
        System.out.println("@AfterAll");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach");
    }

    @Test
    void testOne() {
        System.out.println("testOne");
    }

    @Test
    void testTwo() {
        System.out.println("testTwo");
    }

    @AfterEach
    void tearThis() {
        System.out.println("@AfterEach");
    }
}
