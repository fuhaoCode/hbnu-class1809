package com.hbnudingli.edu;

import javax.swing.*;
import java.util.Scanner;

public class DayOfYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请你输入年份：");
        int year = scanner.nextInt();

        System.out.println("请你输入月份：");
        int month = scanner.nextInt();

        System.out.println("请输入日期：");
        int day = scanner.nextInt();

        int count = 0;
        int days = 0;

        for (int i = 0; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2: {
                    if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                }
                default:
                    break;
            }
            count += days;
        }

        System.out.println("这是" + year + "的第" + (count + day) + "天");
    }
}
