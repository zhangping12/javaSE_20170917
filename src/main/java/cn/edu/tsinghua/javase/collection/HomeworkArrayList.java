package cn.edu.tsinghua.javase.collection;

import java.util.ArrayList;

public class HomeworkArrayList {
    // 求得 ArrayList 对象的容量？ 三大特性

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("hello");

        System.out.println(strings.size()); // 2

        // Object[] elementData;
        // length -> capacity;
    }
}