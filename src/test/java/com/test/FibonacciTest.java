package com.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void case1() {
        assertEquals(13, Fibonacci.calculate(8));
    }

    @Test
    void case2() {
        assertEquals(55, Fibonacci.calculate(11));
    }

}