package cn.dingli.edu.InputOutputStream;

import java.io.File;
import java.io.IOException;

public class CreateDeleteFile {
    public static void main(String[] args) {
        // 文件路径 + 文件名
        String fileName = "E:" + File.separator + "DingLi" + File.separator + "jixin1809.txt";

        // 创建文件类对象
        File file = new File(fileName);

        if (file.exists()) {
            // 文件存在则删除文件
            file.delete();
            System.out.println("文件删除成功......");
        } else {
            // 文件不存在则创建文件
            try {
                file.createNewFile();
                System.out.println("文件创建成功......");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
