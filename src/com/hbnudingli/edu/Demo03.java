package com.hbnudingli.edu;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1、将数据保存到num
        int num = scanner.nextInt();

        // 2、将每位数字存入数组
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num / (int)Math.pow(10, i) % 10;
            arr[i] += 5;
            arr[i] %= 10;
        }

        // 3、输出加密后的数据
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
