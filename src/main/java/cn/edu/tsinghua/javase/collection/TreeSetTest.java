package cn.edu.tsinghua.javase.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("北京");
        strings.add("你好");
        strings.add("广州");
        strings.add("上海");
        strings.add("一");

        System.out.println(strings.size());//5
        for (String string : strings) { //结果是按照unicode码的值升序排序，如下：
            System.out.println(string); //一
        }                               //上海
                                        //你好
                                        //北京
                                        //广州


        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("中");
        System.out.println(strings1.get(0));//中

        char c1 =  '上';
        char c2 =  '你';
        char c3 =  '北';
        char c4 =  '广';             //打印出的unicode码如下：
        System.out.println((int)c1);//19978
        System.out.println((int)c2);//20320
        System.out.println((int)c3);//21271
        System.out.println((int)c4);//24191
        System.out.println((int)'一');//19968
    }
}
