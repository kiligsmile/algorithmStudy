package com.smile.jzOffer;

public class l1732 {
    class Solution {
        public int largestAltitude(int[] gain) {
            int height=0;
            int max=0;
            int arr[]=new int [gain.length+1];
            arr[0]=0;
            for(int i=1;i<arr.length;i++){
                arr[i]=gain[i-1];
            }
            for(int i=1;i<arr.length;i++){
                int x=arr[i]+arr[i-1];
                arr[i]=x;
                if(x>max){
                    max=x;
                }
            }
            return max;
        }
    }
}
