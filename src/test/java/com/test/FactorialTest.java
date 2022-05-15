package com.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {


    @Test
    void case1() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    void case2() {
        assertEquals(1, Factorial.calculate(1));
    }

    @Test
    void case3() {
        assertEquals(24, Factorial.calculate(4));
    }
}