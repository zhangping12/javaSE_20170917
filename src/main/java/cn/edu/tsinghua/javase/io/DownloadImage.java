package cn.edu.tsinghua.javase.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
    private static final String IMAGE_URL = "http://img.jandan.net/news/2017/09/cf114fae2a31b13bac5a13c5bce745df.jpg";

    public static void main(String[] args) {
//        java.net.URL
        try {
            URL url = new URL(IMAGE_URL);
//            System.out.println(url.getFile());
            try (
                    BufferedInputStream inputStream = new BufferedInputStream(url.openStream());
                    BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("test.jpg"))
            ) {
//                int i;
//                while ((i = inputStream.read()) != -1) {
//                    outputStream.write(i);
//                }
                // 8bit = 1byte
                int i = inputStream.read();
                while (i != -1) {
                    outputStream.write(i);
                    i = inputStream.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}