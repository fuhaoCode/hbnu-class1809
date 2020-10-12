package cn.dingli.edu.InputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo2 {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1809.txt";
        File file = new File(fileName);

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);

            byte[] bytes = new byte[1024];

            int temp = 0; // 存的是从流中堆到的字节
            int length = 0; // 记录数据真实的长度

            while ((temp = inputStream.read()) != -1) {
                bytes[length] = (byte) temp;
                length++;
            }

            System.out.println(new String(bytes, 0, length));



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
