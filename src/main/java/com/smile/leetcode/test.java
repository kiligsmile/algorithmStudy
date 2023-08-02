package com.smile.leetcode;



public class test {
    void bubbleSort(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int index=0;index<num.length-i-1;index++){
                if(num[index]>num[index+1]){
                    int temp=num[index];
                    num[index]=num[index+1];
                    num[index+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
//        int nums[]=new int [10];
        int nums[]={9,8,7,6,5,4,3,2,1};
        test test1=new test();
        test1.bubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
