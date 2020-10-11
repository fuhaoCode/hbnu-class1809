package com.hbnudingli.edu;

import java.util.Scanner;

public class JsponeCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入玩游戏的人数：");
        int n = scanner.nextInt();

        System.out.println("请输入游戏开始人编号：");
        int k = scanner.nextInt();

        System.out.println("请输入数数间隔：");
        int m = scanner.nextInt();

        int[] person = new int[n];
        int[] req = new int[n];

        for (int i = 0; i < n; i++) {
            int index = k;
            for (int j = 0; j < m; index++) {
                if (person[index % n] == 0) {
                    j++;
                }
            }
            person[(index - 1) % n] = 1;
            req[i] = (index - 1) % n;
            k = index % n;
        }

        System.out.println("出圈者编号：");
        for (int i = 0; i < req.length; i++) {
            System.out.print(req[i] + " ");
        }
    }
}
