package cn.dingli.edu.exception;

public class Demo {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = divide(4, 0);

        } catch (ArithmeticException e) {
            System.out.println("======");
        }
    }

    private static int divide(int i, int i1) {
        if (i1 == 0) {
            throw new ArithmeticException("不能被0整除");
        }
        return i / i1;
    }
}
