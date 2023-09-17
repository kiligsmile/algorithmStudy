package com.smile.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class l739 {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int length=temperatures.length;
            int ans[]=new int[length];
            Deque<Integer> stack=new LinkedList<Integer>();
            for(int i=0;i<length;i++){
                int temperature=temperatures[i];
                while(!stack.isEmpty()&&temperature>temperatures[stack.peek()]){
                    int prevIndex=stack.pop();
                    ans[prevIndex]=i-prevIndex;
                }
                stack.push(i);
            }
            return ans;
        }
    }
}
