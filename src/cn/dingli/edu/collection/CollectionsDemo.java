package cn.dingli.edu.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("jixin");
        arrayList.add("1809");

        Collections.addAll(arrayList, "hbnu", "teacher");
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
