package com.smile.leetcode.jzOffer;

import java.util.Arrays;

public class l1679 {
    class Solution {
        public int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int i=0,j=nums.length-1;
            int count=0;
            while(i<j){
                if(nums[i]+nums[j]>k){
                    j--;
                }
                else if(nums[i]+nums[j]<k){
                    i++;
                }
                else{
                    System.out.println(nums[i]+nums[j]);
                    count++;
                    i++;
                    j--;
                }
            }
            return count;
        }
    }
}
