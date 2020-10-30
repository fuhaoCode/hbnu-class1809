package cn.dingli.edu.multiThread;

/**
 * 输出1-100之间的偶数
 *
 * @author 陈迪凯
 * @date 2020-10-30 14:25
 */
public class ThreadDemo04 extends Thread {
    @Override
    public void run() {
        for (int i = 2; i < 100; i+=2) {
            System.out.println(Thread.currentThread().getName() + ">>>>偶数：" + i);
        }
    }
}
