package com.smile.leetcode.jzOffer;

import java.util.Arrays;

public class l724 {
    class Solution {
        public int pivotIndex(int[] nums) {
            int total = Arrays.stream(nums).sum();
            int sum = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (2 * sum + nums[i] == total) {
                    return i;
                }
                sum += nums[i];
            }
            return -1;
        }
    }
}
