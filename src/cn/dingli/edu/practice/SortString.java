package cn.dingli.edu.practice;

import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int[] num = new int[s1.length];

        try {
            // 将数字字符串中的数字转成整型数据
            for (int i = 0; i < s1.length; i++) {
                num[i] = Integer.parseInt(s1[i]);
            }

            // 排序
            for (int i = 0; i < num.length - 1; i++) {
                for (int j = 0; j < num.length - 1 - i; j++) {
                    if (num[j] > num[j+1]) {
                        int temp  = num[j];
                        num[j] = num[j+1];
                        num[j+1] = temp;
                    }
                }
            }

            // 将整型数据存入StringBuilder
            StringBuilder stringBuilder = new StringBuilder();
            for (int i  = 0; i < num.length; i++) {
                if (i == num.length - 1) {
                    stringBuilder.append(num[i]);
                    break;
                }
                stringBuilder.append(num[i] + " ");
            }

            System.out.println(stringBuilder.toString());
        } catch (Exception e) {
            System.out.println("你输入的字符串含有非数字字符串");
        }
    }
}
