package com.smile.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class l15 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            HashSet<List<Integer>> result = new HashSet<>();
            int len=nums.length;
            for(int i=0;i<len;i++){
                for(int j=len-1;j>(i+1);j--){
                    int sum=nums[i]+nums[j];
                    int n=-1*sum;
                    int flag=0;
                    for(int k=i+1;k<j;k++){
                        if(nums[k]==n){
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1){
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(n);
                        arr.add(nums[j]);
                        result.add(arr);
                    }

                }
            }
            List<List<Integer>> re=new ArrayList<>(result);
            return re;
        }
    }

    class Solution2 {
        public List<List<Integer>> threeSum(int[] nums) {
            int n=nums.length;
            Arrays.sort(nums);
            List<List<Integer>> ans=new ArrayList<List<Integer>>();
            for(int first=0;first<n;first++){
                if(first>0&&nums[first]==nums[first-1]){
                    continue;
                }
                int third=n-1;
                int target=-nums[first];
                for(int second=first+1;second<n;second++){
                    if(second>first+1&&nums[second]==nums[second-1]){
                        continue;
                    }
                    while(second<third&&nums[second]+nums[third]>target){
                        third--;
                    }
                    if(second==third){
                        break;
                    }
                    if(nums[second]+nums[third]==target){
                        List<Integer> list=new ArrayList<Integer>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        ans.add(list);
                    }
                }
            }
            return ans;
        }
    }
}
