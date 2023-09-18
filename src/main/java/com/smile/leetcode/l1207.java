package com.smile.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class l1207 {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer,Integer> occu=new HashMap<>();
            for(int x:arr){
                occu.put(x,occu.getOrDefault(x,0)+1);
            }
            HashSet<Integer> set=new HashSet<>();
            for(Map.Entry<Integer,Integer> x:occu.entrySet()){
                set.add(x.getValue());
            }
            return set.size()==occu.size();
        }
    }
}
