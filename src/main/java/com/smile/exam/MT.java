package com.smile.exam;
import java.util.Scanner;
public class MT {


    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public class Main {
        public void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int n=in.nextInt();
                long a[]=new long [n];
                long maxn = 0L;
                int flag=0;
                long sum = 0L;
                for(int i=0;i<n;i++){
                    a[i]=in.nextLong();;
                }
                for(int i=0;i<n-1;i++){
                    if(a[i]*a[i+1]>maxn){
                        maxn=a[i]*a[i+1];
                        flag=i;
                    }
                }
                for(int i=0;i<n;i++){
                    if(i!=flag&&i!=(flag+1)){
                        sum+=a[i];
                    }
                }
                sum+=maxn;
                System.out.println(sum);
            }

        }
    }
}
