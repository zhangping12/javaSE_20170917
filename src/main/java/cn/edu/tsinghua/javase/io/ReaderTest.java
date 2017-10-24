package cn.edu.tsinghua.javase.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//基于 字符 的输入流
public class ReaderTest {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("src/main/java/cn/edu/tsinghua/javase/io/ReaderTest.java");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// 中国