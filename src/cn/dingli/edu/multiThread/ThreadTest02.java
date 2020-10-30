package cn.dingli.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-10-30 14:29
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        ThreadDemo04 threadDemo04 = new ThreadDemo04(); // 创建线程对象
        ThreadDemo05 threadDemo05 = new ThreadDemo05(); // 创建线程对象

        threadDemo04.start(); // 启动线程
        new Thread(threadDemo05).start(); // 启动线程

        threadDemo04.setName("偶数线程");

        threadDemo04.setPriority(10);

        System.out.println(threadDemo04.getPriority());
    }
}
