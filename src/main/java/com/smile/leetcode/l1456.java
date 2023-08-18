package com.smile.leetcode;

public class l1456 {
    class Solution {
        boolean judge(char ch){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                return true;
            }
            return false;
        }
        public int maxVowels(String s, int k) {
            int maxn=0;
            int len=s.length();
            int count=0;
            for(int i=0;i<k;i++){
                if(judge(s.charAt(i))){
                    count++;
                }
            }
            maxn=count;
            for(int i=k;i<len;i++){
                if(judge(s.charAt(i))){
                    count++;
                }
                if(judge(s.charAt(i-k))){
                    count--;
                }
                if(count>maxn){
                    maxn=count;
                }
            }
            return maxn;
        }
    }
}
