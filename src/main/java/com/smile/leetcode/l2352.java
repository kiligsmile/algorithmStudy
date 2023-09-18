package com.smile.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class l2352 {
    class Solution {
        public int equalPairs(int[][] grid) {
            int res=0,n=grid.length;
            for(int row=0;row<n;row++){
                for(int col=0;col<n;col++){
                    if(equal(row,col,n,grid)){
                        res++;
                    }
                }
            }
            return res;
        }
        public boolean equal(int row,int col,int n,int grid[][]){
            for(int i=0;i<n;i++){
                if(grid[row][i]!=grid[i][col]){
                    return false;
                }
            }
            return true;
        }
    }

    class Solution2 {
        public int equalPairs(int[][] grid) {
            int n=grid.length;
            Map<List<Integer>,Integer> count=new HashMap<List<Integer>,Integer>();
            for(int row[]:grid){
                List<Integer> arr=new ArrayList<Integer>();
                for(int num:row){
                    arr.add(num);
                }
                count.put(arr,count.getOrDefault(arr,0)+1);
            }
            int res=0;
            for(int j=0;j<n;j++){
                List<Integer> arr=new ArrayList<>();
                for(int i=0;i<n;i++){
                    arr.add(grid[i][j]);
                }
                if(count.containsKey(arr)){
                    res+=count.get(arr);
                }
            }
            return res;
        }
    }
}
