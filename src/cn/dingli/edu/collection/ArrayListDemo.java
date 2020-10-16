package cn.dingli.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();

        arrayList.add("jixin");
        arrayList.add(123);  // 自动装箱机制 int->Integer float->Float
        arrayList.add(null);
        arrayList.add("jixin");
        System.out.println(arrayList);
        arrayList.add(2, "hbnu");
        System.out.println(arrayList);

        arrayList.set(2, "dingli");
        System.out.println(arrayList);

        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.get(2));

        // for循环遍历集合元素
        System.out.println("========for========");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // foreach循环遍历集合元素
        System.out.println("===========foreach=========");
        for (Object obj : arrayList) {
            System.out.println(obj);
        }

        // iterator遍历集合元素
        System.out.println("=============iterator=========");
        Iterator iterator = arrayList.iterator(); // 获取集合的迭代器
        while (iterator.hasNext()) {
            Object next = iterator.next(); // 获取集合中的元素
            System.out.println(next);
        }
    }
}
