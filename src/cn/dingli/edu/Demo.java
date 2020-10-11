package cn.dingli.edu;

public class Demo {
    static int id = 12;

    public Demo() {
    }

    public void changeId() {
        id *= 2;
        System.out.println(id);
    }

    public static void main(String[] args) {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();

        demo2.id = 20;

        System.out.println("demo1的Id:" + demo1.id);   // 24
        System.out.println("demo2的Id:" + demo2.id);   // 40
    }
}
