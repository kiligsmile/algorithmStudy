package com.smile.leetcode;

public class l122 {
    class Solution {
        public int maxProfit(int[] prices) {
            int n=prices.length;
            int[][]dp=new int[n][2];
            dp[0][0]=0;
            dp[0][1]=-prices[0];
            for(int i=1;i<n;i++){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
                dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            }
            return dp[n-1][0];
        }

        public int maxProfit2(int[] prices) {
            int n=prices.length;
            int dp0=0;
            int dp1=-prices[0];
            for(int i=1;i<n;i++){
                int newdp0=Math.max(dp0,dp1+prices[i]);
                int newdp1=Math.max(dp1,dp0-prices[i]);
                dp0=newdp0;
                dp1=newdp1;
            }
            return dp0;
        }


    }
}
