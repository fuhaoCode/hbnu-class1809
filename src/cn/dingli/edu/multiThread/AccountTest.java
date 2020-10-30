package cn.dingli.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-10-30 15:50
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        new Thread(account, "A储户").start();
        new Thread(account, "B储户").start();
    }
}
