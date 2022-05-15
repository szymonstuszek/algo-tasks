package com.test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SaddlePointsTest {

    @Test
    void case1() {
        int[][] input = new int[][] {
                {9, 8, 7},
                {5, 3, 2},
                {6, 6, 7}
        };

        Set<MatrixCoordinate> expectedSaddlePoints = Collections.singleton(new MatrixCoordinate(2, 1));

        assertEquals(expectedSaddlePoints, SaddlePoints.getSaddlePoints(input));
    }

    @Test
    void case2() {
        int[][] input = new int[][] {
                {1, 2, 3},
                {3, 1, 2},
                {2, 3, 1}
        };

        Set<MatrixCoordinate> expectedSaddlePoints = Collections.emptySet();

        assertEquals(expectedSaddlePoints, SaddlePoints.getSaddlePoints(input));
    }

    @Test
    void case3() {
        int[][] input = new int[][] {
                {4, 5, 4},
                {3, 5, 5},
                {1, 5, 4}
        };

        Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(1, 2),
                new MatrixCoordinate(2, 2),
                new MatrixCoordinate(3, 2)
        ));

        assertEquals(expectedSaddlePoints, SaddlePoints.getSaddlePoints(input));
    }

    @Test
    void case4() {
        int[][] input = new int[][] {
                {8, 7, 9},
                {6, 7, 6},
                {3, 2, 5}
        };

        Set<MatrixCoordinate> expectedSaddlePoints = Collections.singleton(new MatrixCoordinate(3, 3));

        assertEquals(expectedSaddlePoints, SaddlePoints.getSaddlePoints(input));
    }

    @Test
    void case5() {
        int[][] input = new int[][] {
                {3, 1, 3},
                {3, 2, 4}
        };

        Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(1, 3),
                new MatrixCoordinate(1, 1)
        ));

        assertEquals(expectedSaddlePoints, SaddlePoints.getSaddlePoints(input));
    }
}