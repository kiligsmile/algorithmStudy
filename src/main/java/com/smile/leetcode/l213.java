package com.smile.leetcode;

public class l213 {
    class Solution {
        public int rob(int[] nums) {
            int len=nums.length;
            if(len==0){
                return 0;
            }else if(len==1){
                return nums[0];
            }else if(len==2){
                return Math.max(nums[0],nums[1]);
            }
            return Math.max(robRange(nums,0,len-2),robRange(nums,1,len-1));
        }
        public int robRange(int []nums,int start,int end){
            int first=nums[start];
            int second=Math.max(nums[start],nums[start+1]);
            for(int i=start+2;i<=end;i++){
                int temp=second;
                second=Math.max(first+nums[i],second);
                first=temp;
            }
            return second;
        }
    }
}
