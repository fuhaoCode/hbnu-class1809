package cn.dingli.edu.exception;

public class TestDefineExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new DefineExceptionDemo("自定义的异常类");
        } catch (DefineExceptionDemo e) {
            System.out.println("============");
            e.printStackTrace();
        }
    }
}
