package cn.dingli.edu.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 陈迪凯
 * @date 2020-11-04 17:32
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getHostName());

            InetAddress inetAddress1 = InetAddress.getByName("192.168.8.114");
            System.out.println(inetAddress1.getHostAddress());
            System.out.println(inetAddress1.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
