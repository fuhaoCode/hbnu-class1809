package cn.dingli.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-10-30 15:48
 */
public class Account implements Runnable {

    private double money;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                int i = 0;
                for (i = 0; i < 3; i++) {
                    try {
                        Thread.sleep((int)Math.random()*100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    money += 1000;
                    System.out.println(Thread.currentThread().getName() + "存入了1000\n" + "账户余额：" + money);
                }
                if (i == 3) {
                    break;
                }
            }

        }
    }
}
