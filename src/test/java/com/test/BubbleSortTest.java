package com.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @Test
    void case1() {
        List<Integer> input = List.of();
        List<Integer> expected = List.of();

        assertEquals(expected, BubbleSort.sort(input));
    }


    @Test
    void case2() {
        List<Integer> input = List.of(2, 1, 3);
        List<Integer> expected = List.of(1, 2, 3);

        assertEquals(expected, BubbleSort.sort(input));
    }

    @Test
    void case3() {
        List<Integer> input = List.of(26, 15, 10, 50, 39, 3, 8, 90, 0, 65);
        List<Integer> expected = List.of(0, 3, 8, 10, 15, 26, 39, 50, 65, 90);

        assertEquals(expected, BubbleSort.sort(input));
    }

    @Test
    void case4() {
        List<Integer> input = List.of(26, 15, 10, 50, -39, 3, 8, 90, 0, 65);
        List<Integer> expected = List.of(-39, 0, 3, 8, 10, 15, 26, 50, 65, 90);

        List<Integer> toSort = new ArrayList<>(input);
        Collections.sort(toSort);

        assertEquals(expected, BubbleSort.sort(input));
    }

    @Test
    void case5() {
        List<Integer> input = List.of(65, 26, 15, 10, 50, -39, 3, 8, 90, 0, 65);
        List<Integer> expected = List.of(-39, 0, 3, 8, 10, 15, 26, 50, 65, 65, 90);

        List<Integer> toSort = new ArrayList<>(input);
        Collections.sort(toSort);

        assertEquals(expected, BubbleSort.sort(input));
    }
}