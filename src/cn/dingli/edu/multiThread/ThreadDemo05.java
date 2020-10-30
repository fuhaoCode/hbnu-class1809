package cn.dingli.edu.multiThread;

/**
 * 输出1-100之间的奇数
 *
 * @author 陈迪凯
 * @date 2020-10-30 14:27
 */
public class ThreadDemo05 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 100; i+=2) {
            System.out.println("====奇数：" + i);
        }
    }
}
