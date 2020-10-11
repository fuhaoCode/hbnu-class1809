package cn.dingli.edu.innerclass;

public class Outer {
    // 属性
    private int id = 100;
    // 行为
    public String method1() {
        return "外部内方法一";
    }

    public class Inner {
        // 属性
        String name = "1809";
        int id = 200;

        // 行为
        public void innerMethod() {
            // 内部类访问属性
            System.out.println(id);
            System.out.println(Outer.this.id);

            // 内部类访问方法
            System.out.println(method1());
            System.out.println(Outer.this.method1());
        }

        public String method2() {
            return "内部类方法二";
        }

        public String method1() {
            return "内部类方法一";
        }
    }
}
