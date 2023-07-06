package com.smile.leetcode.jzOffer;

public class l1776 {
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            int len1=word1.length();
        int len2=word2.length();
        StringBuilder s =new StringBuilder();
        int j=0,i=0;
        while(j<len1||i<len2){
            if(j<len1){
                s.append(word1.charAt(j));
                j++;
            }
            if(i<len2){
                s.append(word2.charAt(i));
                i++;
            }
        }
        return s.toString();
        }
    }
}
