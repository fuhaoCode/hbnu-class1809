package cn.dingli.edu.InputOutputStream;

import java.io.IOException;

public class PipedStreamTest {
    public static void main(String[] args) {
        PipedOutputStreamDemo pipedOutputStreamDemo = new PipedOutputStreamDemo();
        PipedInputStreamDemo pipedInputStreamDemo = new PipedInputStreamDemo();

        try {
            pipedOutputStreamDemo.getPipedOutputStream().connect(pipedInputStreamDemo.getPipedInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(pipedOutputStreamDemo).start(); // 启动线程
        new Thread(pipedInputStreamDemo).start(); // 启动线程
    }
}
