package cn.dingli.edu.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();

        hashSet.add(new Person("jixin", 18));
        hashSet.add(new Person("1809", 18));
        hashSet.add(new Person("chendikai", 18));
        hashSet.add(new Person("jixin", 18));

        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
