package cn.edu.tsinghua.javase.collection;

import java.util.Vector; // util - utility 实用程序\ [juːˈtɪlɪtɪ]

/**
 * 向量 vector是一个能够存放任意类型的动态数组，能够增加和压缩数据。
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>(); // E Element 元素
        strings.add("hi");
        strings.add("hello");

        System.out.println(strings.get(1));//hello
        System.out.println(strings.get(0));//hi
        System.out.println(strings.size());//2
        System.out.println(strings.capacity()); // 容量,\ 能力,\ 容积    值是不固定的

        for (int i = 0; i < 2; i++) {
            strings.add("a");
        }

//        strings.clear();整个移除


//        strings.remove(0);//把hi整个移除

        strings.remove("a");//只是移走第一个a值

        strings.set(0, "test");//给hi设置为test

        System.out.println(strings.size()); // 3
        System.out.println(strings.capacity()); // 10

        System.out.println("---");

        for (String string : strings) {
            System.out.println(string);//test hello a
        }

    }
}