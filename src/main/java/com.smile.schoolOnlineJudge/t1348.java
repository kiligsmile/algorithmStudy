package com.smile.schoolOnlineJudge;

import java.util.Scanner;

public class t1348 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        int sum=0;
        for(int j=0;j<=n;j++){
            for(int i=1;i<=j;i++){
                count+=i;
            }
            sum+=count;
            count=0;
        }
        System.out.println(sum);
    }
}
