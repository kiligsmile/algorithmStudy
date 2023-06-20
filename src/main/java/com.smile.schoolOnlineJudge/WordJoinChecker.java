package com.smile.schoolOnlineJudge;

public class WordJoinChecker {
    public static void main(String[] args) {
        String word1 = "banana";
        String word2 = "quic";
        String result = joinCheck(word1, word2);
        System.out.println(result);
    }

    public static String joinCheck(String word1, String word2) {
        String lowerCaseWord1 = word1.toLowerCase();
        String lowerCaseWord2 = word2.toLowerCase();

        // 检查前一单词尾部与后一单词首部的共同子串
        for (int i = 1; i <= lowerCaseWord1.length(); i++) {
            String tailSubstring = lowerCaseWord1.substring(lowerCaseWord1.length() - i);
            if (lowerCaseWord2.startsWith(tailSubstring)) {
                return "yes";
            }
        }

        return "no";
    }
}