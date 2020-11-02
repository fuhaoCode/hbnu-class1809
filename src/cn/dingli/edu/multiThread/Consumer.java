package cn.dingli.edu.multiThread;

/**
 * 消费者线程
 *
 * @author 陈迪凯
 * @date 2020-11-02 14:36
 */
public class Consumer implements Runnable {
    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int)Math.random() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        product.getProduct();
    }
}
