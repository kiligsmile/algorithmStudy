package com.smile.leetcode.jzOffer;

public class l605 {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int len=flowerbed.length+2;
            int[] flowe=new int[len];
            for(int i=0;i<flowerbed.length;i++){
                flowe[i+1]=flowerbed[i];
            }
            flowe[0]=0;
            flowe[len-1]=0;
            for(int i=1;i<len-1;i++){
                if(flowe[i-1]==0&&flowe[i+1]==0&&flowe[i]==0){
                    n--;
                    flowe[i]=1;
                }
                if(n<=0){
                    break;
                }
            }
            if(n<=0){
                return true;
            }else{
                return false;
            }
        }
    }
}
