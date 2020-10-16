package cn.dingli.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("jixin");
        arrayList.add("1809");
        arrayList.add("dingli");
        arrayList.add("hbnu");

        Iterator<String> iterator = arrayList.iterator(); // 获取迭代器
        for (;iterator.hasNext();) {
            String next = iterator.next();
            if ("dingli".equals(next)) {
                iterator.remove();
            }
        }
        System.out.print(arrayList);
    }
}
