package com.smile.schoolOnlineJudge;

public class ArraySegmentSwap {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int startIndex = 2; // 指定要交换的起始索引
        int endIndex = 7; // 指定要交换的结束索引

        // 确保startIndex和endIndex在有效范围内
        if (startIndex < 0 || endIndex >= numbers.length || startIndex > endIndex) {
            System.out.println("指定的索引范围无效");
            return;
        }

        // 计算交换段的长度
        int segmentLength = endIndex - startIndex + 1;

        // 创建一个临时数组来保存交换的段
        int[] temp = new int[segmentLength];

        // 复制要交换的段到临时数组
        System.arraycopy(numbers, startIndex, temp, 0, segmentLength);

        // 将后半部分的数移动到前半部分
        System.arraycopy(numbers, endIndex + 1, numbers, startIndex, numbers.length - endIndex - 1);

        // 将临时数组中的数复制到后半部分
        System.arraycopy(temp, 0, numbers, startIndex + numbers.length - endIndex - 1, segmentLength);

        // 打印交换后的结果数列
        System.out.println("交换后的数列:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}