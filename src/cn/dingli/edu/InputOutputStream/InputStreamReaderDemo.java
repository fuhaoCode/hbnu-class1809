package cn.dingli.edu.InputOutputStream;

import java.io.*;

public class InputStreamReaderDemo {

    public static void main(String[] args) {
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1809_2.txt";

        File file = new File(fileName);

        InputStreamReader inputStreamReader = null;

        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file));

            char[] chars = new char[1024];

            int length = inputStreamReader.read(chars);

            System.out.println(new String(chars, 0, length));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
