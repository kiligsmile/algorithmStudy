package com.smile.leetcode.jzOffer;

public class l345 {
    class Solution {
        public String reverseVowels(String s) {
            StringBuilder sb=new StringBuilder(s);
            int len=s.length();
            int i=0,j=len-1;
            while(i<j){
                while(i<len&&!judge(sb.charAt(i))){
                    i++;
                }
                while(j>=0&&!judge(sb.charAt(j))){
                    j--;
                }
                if(i<j){
                    char temp=sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                    i++;
                    j--;
                }
            }
            return sb.toString();
        }

        boolean judge(char ch){
            return "aeiouAEIOU".indexOf(ch)>-1;
        }
    }
}
