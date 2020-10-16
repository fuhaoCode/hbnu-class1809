package cn.dingli.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class HeroesTest {
    public static void main(String[] args) {
        ArrayList<Heroes> arrayList = new ArrayList<>();

        Heroes heroes1 = new Heroes("后羿", 18, "射手");
        Heroes heroes2 = new Heroes("妲己", 18, "法师");
        Heroes heroes3 = new Heroes("后羿", 18, "射手");

        arrayList.add(heroes1);
        arrayList.add(heroes2);
        arrayList.add(heroes3);

        Iterator<Heroes> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Heroes heroes = iterator.next();
            System.out.println(heroes.getName() + ":" + heroes.getAge() + ":" + heroes.getRole());
        }
    }
}
