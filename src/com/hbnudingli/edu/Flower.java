package com.hbnudingli.edu;

public class Flower {
    public static void main(String[] args) {
        flower_method1();
        System.out.println();

        System.out.println("=============");

        flower_method2();
    }

    private static void flower_method2() {
        int i = 100;
        while (i < 1000) {
            int x = i % 10;
            int y = i / 10 % 10;
            int z = i / 10 / 10 % 10;

            if (x * x * x + y * y * y + z * z * z == i) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    private static void flower_method1() {
        for (int i = 100; i < 1000; i++) {
            int x = i % 10;
            int y = i / 10 % 10;
            int z = i / 10 / 10 % 10;

            if (x * x * x + y * y * y + z * z * z == i) {
                System.out.print(i + " ");
            }

        }
    }
}
