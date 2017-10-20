package cn.edu.tsinghua.javase.collection;

import java.util.*;

public class SingletonListVsArrayList {
    public static void main(String[] args) {
        String[] strings = {"hi", "hello"};
        List<String> list = Arrays.asList(strings); // ***** 把数组转换为list对象

        Iterator<String> iterator = list.iterator();//迭代
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        list = Collections.singletonList("test");//singletonList在方法调用返回一个只包含指定对象的不可变列表。

        for (String s : list) {
            System.out.println(s);//所以控制台输出test
        }

        System.out.println(list.size());//1
    }
}