package cn.edu.tsinghua.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//基于 字节 的输出流
public class OutputStreamTest {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        try {
             outputStream = new FileOutputStream("test");
            outputStream.write(65);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }finally {
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}