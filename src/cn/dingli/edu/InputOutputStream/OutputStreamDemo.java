package cn.dingli.edu.InputOutputStream;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1809.txt";
        File file = new File(fileName);

        // 声明字节输出流
        OutputStream outputStream = null;

        try {
            // 创建字节输出流对象
            outputStream = new FileOutputStream(file, true); // 如果文件不存在

            String str = "\r\n班长：陈鸿基";

            byte[] bytes = str.getBytes();  // 将字符串转为字节数组

            // 往字节流中写数据
            // outputStream.write(bytes);

            // 一个字节一个字节的往字节流中写数据
            for (int i = 0; i < bytes.length; i++) {
                outputStream.write(bytes[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
