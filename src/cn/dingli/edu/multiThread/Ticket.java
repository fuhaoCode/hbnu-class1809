package cn.dingli.edu.multiThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈迪凯
 * @date 2020-10-30 15:01
 */
public class Ticket implements Runnable {
    private int ticket = 10;

    private final ReentrantLock lock = new ReentrantLock(); // 创建锁对象

    @Override
    public void run() {
        while (true) {

            lock.lock(); // 加锁
            try {
                Thread.sleep((int) Math.random() * 100);
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了>>>" + ticket-- + "号票");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock(); // 释放锁

            }


        }
    }
}
