package com.leet.code.array.remove_duplicates_from_sorted_array_26;

import com.leet.code.solutions.remove_duplicates_from_sorted_array_26.Solution;
import com.leet.code.solutions.remove_duplicates_from_sorted_array_26.Solution1;
import com.leet.code.solutions.remove_duplicates_from_sorted_array_26.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    int arr1[] = new int[]{1, 1, 2};
    int lenResult1 = 2;
    int result1[] = new int[]{1, 2};


    int arr2[] = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int lenResult2 = 5;
    int result2[] = new int[]{0, 1, 2, 3, 4};

    @Test
    void testSolution1() {
        assertSolution(new Solution1());
    }

    @Test
    void testSolution2() {
        assertSolution(new Solution2());

    }

    private void assertSolution(Solution solution) {
        int len1 = solution.removeDuplicates(arr1);
        Assertions.assertEquals(lenResult1, len1);
        for (int i = 0; i < len1; i++) {
            Assertions.assertEquals(result1[i], arr1[i]);
        }

        int len2 = solution.removeDuplicates(arr2);
        Assertions.assertEquals(lenResult2, len2);
        for (int i = 0; i < len2; i++) {
            Assertions.assertEquals(result2[i], arr2[i]);
        }
    }
}
