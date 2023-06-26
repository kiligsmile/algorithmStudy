package com.smile.leetcode.jzOffer;

public class l11 {
    class Solution {
        public int maxArea(int[] height) {
            int i=0,j=height.length-1;
            int res=0;
            while(i<j){
                if(height[i]<height[j]){
                    res=Math.max(res,(j-i)*height[i++]);
                }
                else{
                    res=Math.max(res,(j-i)*height[j--]);
                }
            }
            return res;
        }
    }
}
