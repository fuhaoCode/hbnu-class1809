package cn.dingli.edu.multiThread;

/**
 * @author 陈迪凯
 * @date 2020-11-02 14:37
 */
public class ProAndConTest {
    public static void main(String[] args) {
        Product product = new Product();

        Productor productor = new Productor(product); // 创建生产者线程对象
        Consumer consumer = new Consumer(product); // 创建消费者线程对象

        new Thread(productor).start(); // 启动生产者线程
        new Thread(consumer).start(); // 启动消费者线程
    }
}
