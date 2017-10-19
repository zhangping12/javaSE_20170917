package cn.edu.tsinghua.javase.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class HomeworkArrayList {
    // 求得 ArrayList 对象的容量？

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("hi");
        }
        strings.add("hello");

        System.out.println(strings.size()); // 11

        // Object[] elementData;
        // length -> capacity;

        // class = field + method
        Field field = ArrayList.class.getDeclaredField("elementData");// java.lang.reflect
        field.setAccessible(true);//默认是false，加这句的作用就是让我们在用反射时访问私有变量


     //   strings.trimToSize();//修剪，使size=capacity，本来是11 ，15 ，修剪完变为11，11

        System.out.println(((Object[]) field.get(strings)).length);
//        ensure 确保\ [ɪn'ʃɔː\;\ -'ʃʊə\;\ en-]
/*
        int n = 10000000;
        ArrayList<Integer> list = new ArrayList<>(n);
//        list.ensureCapacity(n);
        int capacity = ((Object[]) field.get(list)).length;
        System.out.println("capacity: " + capacity);
        long begin = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        System.out.println(System.currentTimeMillis() - begin);*/
    }
}