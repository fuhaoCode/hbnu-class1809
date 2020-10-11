package cn.dingli.edu.innerclass;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer(); // 外部类对象
        Outer.Inner inner = outer.new Inner(); // 内部类对象

        inner.innerMethod();
    }
}
