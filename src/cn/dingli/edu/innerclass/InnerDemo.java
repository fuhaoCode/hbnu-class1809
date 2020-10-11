package cn.dingli.edu.innerclass;

public class InnerDemo {

    public static void main(String[] args) {
        callInner(new InterfaceTest() {
            @Override
            public void hello() {
                System.out.println("=========");
            }
        });
    }

    public static void callInner(InterfaceTest interfaceTest) {
        interfaceTest.hello();
    }
}
