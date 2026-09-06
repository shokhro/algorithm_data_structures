package org.example.src.leetcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStartValueTest {

    private final MinStartValue solution = new MinStartValue();

    @Test
    void testExample1() {
        int[] nums = {-3, 2, -3, 4, 2};
        assertEquals(5, solution.minStartValue(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {1, 2};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    void testExample3() {
        int[] nums = {1, -2, -3};
        assertEquals(5, solution.minStartValue(nums));
    }

    @Test
    void testSingleElementPositive() {
        int[] nums = {5};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    void testSingleElementNegative() {
        int[] nums = {-5};
        assertEquals(6, solution.minStartValue(nums));
    }

    @Test
    void testAllPositive() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    void testAllNegative() {
        int[] nums = {-1, -1, -1, -1};
        assertEquals(5, solution.minStartValue(nums));
    }

    @Test
    void testAllZeros() {
        int[] nums = {0, 0, 0};
        assertEquals(1, solution.minStartValue(nums));
    }

    @Test
    void testMinAtLastElement() {
        // eng past nuqta oxirgi elementda bo'lsa
        int[] nums = {5, 5, -20};
        assertEquals(11, solution.minStartValue(nums));
    }

    @Test
    void testLargeDrop() {
        int[] nums = {-100};
        assertEquals(101, solution.minStartValue(nums));
    }
}
