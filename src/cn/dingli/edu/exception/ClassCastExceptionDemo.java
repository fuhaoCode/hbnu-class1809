package cn.dingli.edu.exception;

import java.util.Date;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        Object obj = new Date();
        ClassCastExceptionDemo classCastExceptionDemo = (ClassCastExceptionDemo)obj;
    }
}
