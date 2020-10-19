package cn.dingli.edu.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
    public static void main(String[] args) {
        Heroes heroes = new Heroes("铠", 18);
        // 序列化
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("out.txt"));
            objectOutputStream.writeObject(heroes); // 对象的序列化
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 反序列化
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("out.txt"));
            Heroes heroes1 = (Heroes) objectInputStream.readObject();
            System.out.println(heroes1.getName() + "::" + heroes1.getAge());
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
