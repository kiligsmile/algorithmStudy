package com.smile.leetcode;

import java.util.HashMap;
import java.util.Map;

public class l2351 {
    class Solution {
        public char repeatedCharacter(String s) {
            Map<Character,Integer> fre=new HashMap<Character,Integer>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                fre.put(ch,fre.getOrDefault(ch,0)+1);
                if(fre.get(s.charAt(i))==2){
                    return s.charAt(i);
                }
            }
            return ' ';
        }
    }
}
