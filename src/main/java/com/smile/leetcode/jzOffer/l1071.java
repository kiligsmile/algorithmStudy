package com.smile.leetcode.jzOffer;

public class l1071 {
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            int len1=str1.length();
            int len2=str2.length();
            if(!(str1.concat(str2).equals(str2.concat(str1)))){
                return "";
            }else{
                return str1.substring(0,gcd(len1,len2));
            }
        }

        int gcd(int a,int b){
            int remainder = a % b;
            while (remainder != 0) {
                a = b;
                b = remainder;
                remainder = a % b;
            }
            return b;
        }
    }
}
