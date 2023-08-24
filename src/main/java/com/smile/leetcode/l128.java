package com.smile.leetcode;

import java.util.HashSet;
import java.util.Set;

public class l128 {
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> nums_set=new HashSet<Integer>();
            for(int num:nums){
                nums_set.add(num);
            }
            int longestStack=0;
            for(int num:nums_set){
                if(!nums_set.contains(num-1)){
                    int currentNum=num;
                    int currentStack=1;
                    while(nums_set.contains(currentNum+1)){
                        currentNum++;
                        currentStack++;
                    }
                    longestStack=Math.max(longestStack,currentStack);
                }
            }
            return longestStack;
        }
    }
}
