package cn.edu.tsinghua.javase.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
//基于 字节 的输入流
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
             inputStream = new FileInputStream("src/main/java/cn/edu/tsinghua/javase/io/InputStreamTest.java");
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


// 中