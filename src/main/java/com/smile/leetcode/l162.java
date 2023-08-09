package com.smile.leetcode;

public class l162 {
    class Solution {
        public int findPeakElement(int[] nums) {
            int len=nums.length;
            int left=0,right=len-1,index=0;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(compare(nums,mid-1,mid)<0&&compare(nums,mid+1,mid)<0){
                    index=mid;
                    break;
                }
                if(compare(nums,mid,mid+1)<0){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            return index;
        }

        public int [] get(int[] nums,int idx){
            if(idx==-1||idx==nums.length){
                return new int[]{0,0};
            }
            return new int[]{1,nums[idx]};
        }

        int compare(int []nums,int idx1,int idx2){
            int[] nums1=get(nums,idx1);
            int[] nums2=get(nums,idx2);
            if(nums1[0]!=nums2[0]){
                // 此时idx1和idx2不全为边界
                return nums1[0]>nums2[0]?1:-1;
            }
            if(nums1[1]==nums2[1]){
                return 0;
            }
            return nums1[1]>nums2[1]?1:-1;
        }
    }
}
