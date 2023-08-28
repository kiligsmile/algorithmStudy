package com.smile.jzOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class l735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        stack.push(asteroids[0]);
        for(int i=1;i<asteroids.length;){
            int  a=stack.peek();
            if(a*asteroids[i]<0){
                a=stack.pop();
                if((asteroids[i]+a)!=0){
                    int max=asteroids[i];
                    if(Math.abs(a)>Math.abs(asteroids[i])){
                        max=a;
                    }
                    stack.push(max);
                }
            }else{
                stack.push(asteroids[i]);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Integer ch:stack){
            list.add(ch);
        }
        int[] arr = new int[list.size()];
        int j = 0;
        for (int tmp : list) {
            arr[j++] = tmp;
        }
        return arr;
    }

    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stack=new Stack<>();
            for(int aster:asteroids){
                boolean alive=true;
                while(alive&&aster<0&&!stack.isEmpty()&&stack.peek()>0){
                    alive=stack.peek()<-aster;
                    if(stack.peek()<=-aster){
                        stack.pop();
                    }
                }
                if(alive){
                    stack.push(aster);
                }
            }
            int size=stack.size();
            int num[]=new int[size];
            while(!stack.isEmpty()){
                size--;
                num[size]=stack.pop();
            }
            return num;
        }
    }
}
