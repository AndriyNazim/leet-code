package com.leet.code.array.two_sum_1;

import com.leet.code.solutions.array.two_sum_1.Solution;
import com.leet.code.solutions.array.two_sum_1.Solution1;
import com.leet.code.solutions.array.two_sum_1.Solution2;
import org.junit.jupiter.api.Assertions;

class TwoSumTest {

    int arr1[] = new int[]{2, 7, 11, 15};
    int target1 = 9;

    int arr2[] = new int[]{3, 2, 4};
    int target2 = 6;

    int arr3[] = new int[]{3, 3};
    int target3 = 6;

    int result[] = new int[2];

    int arr4[] = new int[]{17, 4, 5, 9, 11};
    int target4 = 28;

    @org.junit.jupiter.api.Test
    void testSolution1() {
        assertResult(new Solution1());
    }

    @org.junit.jupiter.api.Test
    void testSolution2() {
        assertResult(new Solution2());
    }

    private void assertResult(Solution solution) {


        result = solution.twoSum(arr1, target1);
        assertValues(new int[]{0, 1}, result);

        result = solution.twoSum(arr2, target2);
        assertValues(new int[]{1, 2}, result);

        result = solution.twoSum(arr3, target3);
        assertValues(new int[]{0, 1}, result);

        result = solution.twoSum(arr4, target4);
        assertValues(new int[]{0, 4}, result);


    }

    private void assertValues(int[] expected, int[] actual) {
        int value1 = actual[0] < actual[1] ? actual[0] : actual[1];
        int value2 = actual[0] > actual[1] ? actual[0] : actual[1];
        Assertions.assertEquals(expected[0], value1);
        Assertions.assertEquals(expected[1], value2);
    }

}
