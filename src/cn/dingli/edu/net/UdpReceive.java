package cn.dingli.edu.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP 接收端
 *
 * @author 陈迪凯
 * @date 2020-11-04 17:50
 */
public class UdpReceive {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            // 1、定义UDP Socket服务，监听端口
            datagramSocket = new DatagramSocket(8888);

            // 2、定义数据报包，用于接收从发送端发送过来的数据报包 DatagramPacket(byte[] buf, int length)
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

            // 3、接收发送端发送过来的数据，存入之前定义好的数据报包中
            datagramSocket.receive(datagramPacket); // receive方法是一个阻塞式方法

            // 4、取出接收到的数据
            String ip = datagramPacket.getAddress().getHostAddress();
            int port = datagramPacket.getPort();
            String data = new String(datagramPacket.getData(), 0, datagramPacket.getLength()); // 获取接收端发送过来的数据
            System.out.println(ip + ":" + port + ">>>>" + data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5、关闭资源
            if (datagramSocket != null){
                datagramSocket.close();
            }
        }
    }
}
