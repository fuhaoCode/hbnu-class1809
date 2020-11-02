package cn.dingli.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-10-30 15:48
 */
public class Account implements Runnable {

    private double money;

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                money += 1000;
                System.out.println(Thread.currentThread().getName() + "存入了1000\n" + "账户余额：" + money);
            }
        }
    }

}
