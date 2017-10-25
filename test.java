package cn.edu.tsinghua.javase.io;

import java.io.*;

public class InputStreamOutputStreamTest {

    private static final String FILE = "src/main/java/cn/edu/tsinghua/javase/io/InputStreamOutputStreamTest.java";

    public static void main(String[] args) {

        // try with resources JDK7.0
        try (
                InputStream inputStream = new FileInputStream(FILE);
                OutputStream outputStream = new FileOutputStream("test.java")

        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*try {
            int x = 1 / 0;
            System.out.println("hi".charAt(2));
        } catch (ArithmeticException | StringIndexOutOfBoundsException e) { // JDK7.0 Multi-catch
            e.printStackTrace();
        }*/
    }
}