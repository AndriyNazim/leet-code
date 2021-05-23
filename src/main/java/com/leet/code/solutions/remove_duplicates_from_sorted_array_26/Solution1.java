package com.leet.code.solutions.remove_duplicates_from_sorted_array_26;

//Not all corner case covered
public class Solution1 implements Solution {


    @Override
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int result = 0;
        int threshold = 1;

        for (int i = 1; i < nums.length - result; i++) {
            if (nums[threshold - 1] != nums[threshold]) {
                threshold++;
            }
            if (nums[threshold - 1] == nums[threshold]) {
                int temp = nums[threshold];
                result++;
                for (int j = threshold; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = temp;
            }

        }

        if (nums.length > 1 && nums[nums.length - 1] == nums[nums.length - 2]) {
            return threshold;
        }

        return threshold + 1;
    }
}
