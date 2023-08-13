package com.smile.leetcode;

public class l238 {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int len=nums.length;
            int left[]=new int[len];
            int right[]=new int[len];
            int result[]=new int[len];
            left[0]=nums[0];
            result[0]=nums[0];
            right[len-1]=nums[len-1];
            for(int i=1;i<len;i++){
                left[i]=nums[i]*left[i-1];
            }
            for(int i=len-2;i>=0;i--){
                right[i]=nums[i]*right[i+1];
            }
            for(int i=1;i<len-1;i++){
                result[i]=left[i-1]*right[i+1];
            }
            result[0]=right[1];
            result[len-1]=left[len-2];
            return result;
        }
    }
}
