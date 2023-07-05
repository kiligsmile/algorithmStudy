package com.smile.leetcode.jzOffer;

public class l1776 {
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            int len1=word1.length();
            int len2=word2.length();
            StringBuffer s =new StringBuffer(len1+len2);
            int count=0;
            for(int i=0;i<len1&&i<len2;i++){
                s.setCharAt(count,word1.charAt(i));
                count++;
                s.setCharAt(count,word2.charAt(i));
                count++;
            }
            int index=count/2;
            if(len1<len2){
                for(int i=index;i<len2;i++){
                    s.setCharAt(count,word2.charAt(i));
                    count++;
                }
            }else{
                for(int i=index;i<len1;i++){
                    s.setCharAt(count,word1.charAt(i));
                    count++;
                }
            }
            return s.toString();
        }
    }
}
