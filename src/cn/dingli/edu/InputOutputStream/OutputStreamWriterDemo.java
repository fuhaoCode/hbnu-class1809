package cn.dingli.edu.InputOutputStream;

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1809_2.txt";

        File file = new File(fileName);

        OutputStreamWriter outputStreamWriter = null;

        try {
            // 字符输出流转字节输出流
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));

            String str = "计信1809班";

            outputStreamWriter.write(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
