package cn.edu.tsinghua.javase.collection;

public class StringTest {
    public static void main(String[] args) {
        String s = "hello"; // 直接量
        System.out.println(s);

        byte[] bytes = new byte[10];
//        String s1 = new String(bytes, 1); // deprecated

        String s2 = new String("hello");
        String s3 = "hello";//一般都这样写

        System.out.println(s3.charAt(5));
    }
}