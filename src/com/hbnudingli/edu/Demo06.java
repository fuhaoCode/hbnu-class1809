package com.hbnudingli.edu;

import java.util.Random;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = 0;
            try {
                number = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("您脾气过于暴躁，不适合智力游戏，去玩俄罗斯方块吧！！！");
                break;
            }


            if (number > num) {
                System.out.println("您输入的数据过大！");
            } else if (number < num) {
                System.out.println("您输入的数据过小！");
            } else {
                System.out.println("恭喜您猜对了！！！！！");
                break;
            }
        }
    }
}
