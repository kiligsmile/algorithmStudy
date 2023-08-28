package com.smile.jzOffer;

import java.util.Stack;

public class l2390 {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<Character>();
        int len=s.length();
        int num=len;
        for(int i=0;i<len;i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
                num=num-2;
            }
        }
        char[] ch=new char[num];
        int index=0;
        while(!stack.empty()){
            ch[index]=stack.pop();
            index++;
        }
        String s1 = String.valueOf(ch);
        return new StringBuffer(s1).reverse().toString();
    }

    public String removeStars2(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        char [] cs=s.toCharArray();
        for(char ch:cs){
            if(ch == '*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        for(Character ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }

}
