package cn.dingli.edu.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> objectObjectHashMap = new HashMap<>();

        objectObjectHashMap.put(1, "jixin");
        objectObjectHashMap.put(1, "jixin1");
        objectObjectHashMap.put(2, "jixin2");
        objectObjectHashMap.put(3, "jixin3");
        objectObjectHashMap.put(4, "jixin4");

        Set<Integer> integers = objectObjectHashMap.keySet(); // 获取集合中的key值
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        Collection<String> values = objectObjectHashMap.values(); // 获取集合中value值
        Iterator<String> iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        System.out.println();
        Set<Map.Entry<Integer, String>> entries = objectObjectHashMap.entrySet(); // 获取集合实体对象
        Iterator<Map.Entry<Integer, String>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> next = iterator2.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println("key:" + key + "->value:" + value);
        }
    }
}
