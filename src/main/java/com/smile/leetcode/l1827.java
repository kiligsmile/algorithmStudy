package com.smile.leetcode;

public class l1827 {
    class Solution {
        public int minOperations(int[] nums) {
            int len=nums.length;
            int count=0;
            for(int i=1;i<len;i++){
                if(nums[i]==nums[i-1]){
                    count++;
                    nums[i]=(nums[i-1]+1);
                }else if(nums[i]<nums[i-1]){
                    count+=(nums[i-1]-nums[i]+1);
                    nums[i]=(nums[i-1]+1);
                }
            }
            return count;
        }
    }
}
