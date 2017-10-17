package cn.edu.tsinghua.javase.collection;

import java.util.List;
import java.util.Vector;

public class ListTest {
    public static void main(String[] args) {
        // option + command + U
//        List
        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(-1);
        integers.add(100);
        integers.add(100);

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        System.out.println(integers.capacity());
    }
}