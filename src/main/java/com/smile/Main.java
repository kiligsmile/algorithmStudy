package com.smile;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int m = in.nextInt();
//            int a[]=new int [m+1];
//            for(int s=0;s<n;s++){
//                int k = in.nextInt();
//                int c = in.nextInt();
//                int count=(int)Math.ceil(c*1.0/k);
//                for(int i=0;i<k-1;i++){
//                    int index=in.nextInt();
//                    a[index]+=count;
//                }
//            }
//            for(int i=1;i<m;i++){
//                System.out.print(a[i]+" ");
//            }
//            System.out.println(a[m]);
//        }
//    }
//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    // 注意 hasNext 和 hasNextLine 的区别
//    while (in.hasNextInt()) { // 注意 while 处理多个 case
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int z = in.nextInt();
//        int i;
//        for(i=1;z>=0;i++){
//            z-=x;
//            if((i%3)==1){
//                z-=y;
//            }
//        }
//        System.out.println(i);
//    }
//}
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int q = in.nextInt();
                for(int i=0;i<q;i++){
                    int flag=1;
                    int maxn=-100;
                    int minn=100;
                    int n = in.nextInt();
                    int m = in.nextInt();
                    int a[]=new int [n];
                    int b[]=new int [n];
                    for(int j=0;j<n;j++){
                        a[j]=in.nextInt();
                    }
                    for(int j=0;j<n;j++){
                        b[j]=in.nextInt();
                    }
                    Arrays.sort(a);
                    Arrays.sort(b);
                    for(int j=0;j<n;j++){
                        int sum=a[j]+b[n-1-j];
                        if(sum>maxn){
                            maxn=sum;
                        }
                        if(sum<minn){
                            minn=sum;
                        }
                        if(maxn>m||minn<1){
                            flag=-1;
                            break;
                        }
                    }
                    if(flag==1){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }

            }
        }

}