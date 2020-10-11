package cn.dingli.edu.exception;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        String[] str = {"test1", "test2", "test3"};
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(str[i]);
            }

        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界了......");
        }
    }
}
