package cn.dingli.edu.InputOutputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符输出流
 */
public class WriterDemo {
    public static void main(String[] args) {
        // 1 、文件路径和文件
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1809.txt";

        // 2、创建文件类对象
        File file = new File(fileName);

        // 3、声明字符输出流
        Writer writer = null;

        try {
            // 4、创建字符输出流对象
            writer = new FileWriter(file);

            // 5、准备要写入文件中的数据
            String str = "湖北师范大学计信1809班";

            // 6、因为采用字符输出流往文件中写数据，因此不需要将字符转为字节
            writer.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 7、写完数据后，关闭流资源
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
