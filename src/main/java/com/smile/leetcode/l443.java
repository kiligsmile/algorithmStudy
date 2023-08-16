package com.smile.leetcode;

public class l443 {
    class Solution {
        public int compress(char[] chars) {
            int len=chars.length;
            int k=1,s=0,count=1;
            StringBuilder sb = new StringBuilder();
            while(k<=len){
                while(k<len&&chars[k]==chars[s]){
                    k++;
                    count++;
                }
                sb.append(chars[s]);
                s=k;
                k++;
                if(count>1){
                    sb.append(count);
                }
                count=1;
            }
            char[] str=sb.toString().toCharArray();
            for(int i=0;i<str.length;i++){
                chars[i]=str[i];
            }
            return sb.toString().length();
        }
    }
}
