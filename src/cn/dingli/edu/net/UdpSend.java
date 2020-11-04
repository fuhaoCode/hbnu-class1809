package cn.dingli.edu.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP 发送端
 *
 * @author 陈迪凯
 * @date 2020-11-04 17:40
 */
public class UdpSend {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            // 1、创建UDP Socket 服务
            datagramSocket = new DatagramSocket(6666);

            // 2、将需要发送的数据封装到数据报包中 DatagramPacket(byte[] buf, int length, InetAddress address, int port)
            byte[] buf = "hbnu jixin1809".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 8888);

            // 3、将数据报包发送出去
            datagramSocket.send(datagramPacket);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 4、关闭资源
            if (datagramSocket != null) {

            }
        }
    }
}
