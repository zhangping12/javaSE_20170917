package cn.edu.tsinghua.javase.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            Integer next =  listIterator.next();
            System.out.println(next);
        }
        System.out.println("---");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}