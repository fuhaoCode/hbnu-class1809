package cn.dingli.edu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Poker {

    public static void main(String[] args) {
        // 定义集合存储扑克牌
        ArrayList<String> arrayList = new ArrayList<>();

        // 定义数组存储花色
        String[] colorPoker = {"♥", "♠", "♣", "♦"};

        // 定义数组存储数字
        String[] numberPoker = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // 生成扑克牌，并存入扑克牌集合中，大小王也存入集合中
        for (int i = 0; i < colorPoker.length; i++) {
            for (int j = 0; j < numberPoker.length; j++) {
                arrayList.add(colorPoker[i] + numberPoker[j]);
            }
        }
        arrayList.add("🃏King");
        arrayList.add("🃏Queen");

        // 洗牌
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        // 发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> bottom = new ArrayList<>(); // 底牌

        for (int i = 0; i < arrayList.size(); i++) {
            if (i < 3) {
                bottom.add(arrayList.get(i));
            } else {
                if (i % 3 == 0) {
                    player01.add(arrayList.get(i));
                }
                if (i % 3 == 1) {
                    player02.add(arrayList.get(i));
                }
                if (i % 3 == 2) {
                    player03.add(arrayList.get(i));
                }
            }
        }

        // 看牌
        look("周星驰", player01);
        look("周润发", player02);
        look("刘德华", player03);
        look("底牌", bottom);
    }

    private static void look(String name, ArrayList<String> player) {
        System.out.println(name + "::");
        Iterator<String> iterator = player.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
    }
}
