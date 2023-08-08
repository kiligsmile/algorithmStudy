package com.smile.leetcode;

import java.util.Arrays;

public class l2300 {
    class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int ans[]=new int[spells.length];
            Arrays.sort(potions);
            for(int i=0;i<spells.length;i++){
                int left=0,right=potions.length-1;
                int index=potions.length;
                while(left<=right){
                    int mid=left+(right-left)/2;
                    if((long)spells[i]*potions[mid]>=success){
                        right=mid-1;
                        index=mid;
                    }else{
                        left=mid+1;
                    }
                }
                ans[i]=potions.length-index;
            }
            return ans;
        }
    }
}
