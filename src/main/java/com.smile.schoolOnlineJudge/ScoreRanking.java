package com.smile.schoolOnlineJudge;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        int queryScore = scanner.nextInt();

        // 对成绩列表进行排序
        Arrays.sort(scores);

        // 查找查询成绩的排名
        int ranking = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (scores[i] == queryScore) {
                break;
            }
            if (i < n - 1 && scores[i] != scores[i + 1]) {
                ranking++;
            }
        }

        // 输出查询成绩的排名
        System.out.println(ranking);

        scanner.close();
    }
}