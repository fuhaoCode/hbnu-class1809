package cn.dingli.edu.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        Person daji = new Person("妲己", 18);
        Person houyi = new Person("后羿", 19);
        Person xiaoqiao = new Person("小乔", 18);
        Person lvbu = new Person("lvbu", 18);
        Person houyi1 = new Person("后羿", 18);

        treeSet.add(daji);
        treeSet.add(houyi);
        treeSet.add(xiaoqiao);
        treeSet.add(lvbu);
        treeSet.add(houyi1);

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
