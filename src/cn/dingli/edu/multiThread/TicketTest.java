package cn.dingli.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-10-30 15:04
 */
public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        new Thread(ticket, "1号窗口").start();
        new Thread(ticket, "2号窗口").start();
        new Thread(ticket, "3号窗口").start();
    }
}
