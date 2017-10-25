package cn.edu.tsinghua.javase.io;

import java.io.*;

public class BufferedTest {

    public static void main(String[] args) {
        try (
//                InputStream inputStream = new FileInputStream("/Users/mingfei/Desktop/1025_JavaSE-RandomAccessFile.mov");
//                OutputStream outputStream = new FileOutputStream("test.mov")
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("/Users/mingfei/Desktop/1025_JavaSE-RandomAccessFile.mov"));
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("test.mov"))
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}