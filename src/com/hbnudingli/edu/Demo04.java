package com.hbnudingli.edu;

public class Demo04 {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 170;
        int height3 = 210;

        int temp = 0;
//        temp = height1 > height2 ? height1 : height2;
//        temp = temp > height3 ? temp : height3;
        temp = (height1 > height2 ? height1 : height2) > height3 ? (height1 > height2 ? height1 : height2) : height3;

        System.out.println("最大值：" + temp);

    }
}
