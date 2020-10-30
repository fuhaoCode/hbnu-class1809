package cn.dingli.edu.multiThread;

/**
 * 线程的实现方式二：实现Runnable接口
 *
 * @author 陈迪凯
 * @date 2020-10-30 9:19
 */
public class ThreadDemo02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(">>>子线程执行：" + i);
        }
    }
}
