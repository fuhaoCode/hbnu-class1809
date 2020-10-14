package cn.dingli.edu.InputOutputStream;

import java.io.*;

/**
 * 字符输入流，读数据
 */
public class ReaderDemo {
    public static void main(String[] args) {
        // 1、文件路径和文件名
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1808.txt";

        // 2、创建文件类对象
        File file = new File(fileName);

        // 3、声明字符输入流
        Reader reader = null;

        try {
            // 4、创建字符输入流对象
            reader = new FileReader(file);

            // 5、定义数组，存储从流中读到的数据
            char[] chars = new char[1024];

            // 6、从流中读数据，并存入提前定义好的数组中
            int length = reader.read(chars);

            System.out.println(new String(chars, 0, length));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 7、关闭流资源
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
