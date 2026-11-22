
package com.steven.algorithms.arrays;

import com.steven.algorithms.arrays.TwoSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void testExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        assertArrayEquals(
            new int[]{0, 1},
            solution.twoSum(nums, target)
        );
    }

    @Test
    void testExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        assertArrayEquals(
            new int[]{1, 2},
            solution.twoSum(nums, target)
        );
    }

    @Test
    void testExample3() {
        int[] nums = {3, 3};
        int target = 6;

        assertArrayEquals(
            new int[]{0, 1},
            solution.twoSum(nums, target)
        );
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;

        assertArrayEquals(
            new int[]{0, 2},
            solution.twoSum(nums, target)
        );
    }

    @Test
    void testZeroValues() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;

        assertArrayEquals(
            new int[]{0, 3},
            solution.twoSum(nums, target)
        );
    }

    @Test
    void testMinimumArraySize() {
        int[] nums = {1, 2};
        int target = 3;

        assertArrayEquals(
            new int[]{0, 1},
            solution.twoSum(nums, target)
        );
    }

    @Test
    void testNoSolutionReturnsEmptyArray() {
        assertArrayEquals(
            new int[0],
            solution.twoSum(new int[]{1, 2, 3}, 7)
        );
    }

    @Test
    void testExtremeValuesWithoutIntegerOverflow() {
        assertArrayEquals(
            new int[]{0, 1},
            solution.twoSum(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, -1)
        );
    }

    @Test
    void testNullArrayReturnsEmptyArray() {
        assertArrayEquals(new int[0], solution.twoSum(null, 0));
    }
}
