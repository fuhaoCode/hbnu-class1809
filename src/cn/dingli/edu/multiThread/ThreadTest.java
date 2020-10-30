package cn.dingli.edu.multiThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程测试
 *
 * @author 陈迪凯
 * @date 2020-10-30 9:10
 */
public class ThreadTest {
    public static void main(String[] args) {

        /*
        // 线程的实现方式一：继承Thread类
        // 创建线程对象
        ThreadDemo01 threadDemo01 = new ThreadDemo01();

        // 启动线程
        threadDemo01.start();
        */

        /*
        // 线程的实现方式二：实现Runnable接口
        ThreadDemo02 threadDemo02 = new ThreadDemo02(); // 创建线程对象

        // Thread thread = new Thread(threadDemo02);
        // thread.start(); // 启动线程
        // new Thread(threadDemo02).start(); // 启动线程

        // 使用Lambda实现线程
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(">>>子线程执行：" + i);
            }
        }).start();
        */

        // 线程的执行方式三：实现Callable接口
        ThreadDemo03 threadDemo03 = new ThreadDemo03(); // 创建线程对象
        FutureTask<String> stringFutureTask = new FutureTask<>(threadDemo03);
        Thread thread = new Thread(stringFutureTask);
        thread.start(); //启动线程

        try {
            String str = stringFutureTask.get();
            System.out.println(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("****主线程执行：" + i);
        }
    }
}
