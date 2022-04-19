package com.MarcusJennings.Edabit;

import java.util.Arrays;

public class maximumDifference {
    public static void main(String[] args) {

    }

    public static int difference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }
}
 // The sort() method sorts the elements of an array; The default sort order is ascending,