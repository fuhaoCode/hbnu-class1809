package cn.dingli.edu.InputOutputStream;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1809.txt";
        File file = new File(fileName);

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);

            byte[] bytes = new byte[(int) file.length()]; // 用来存储从流中读到的数据

            int length = inputStream.read(bytes);  // 语句执行完后，流中的数据存储在bytes

            System.out.println(new String(bytes));

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
