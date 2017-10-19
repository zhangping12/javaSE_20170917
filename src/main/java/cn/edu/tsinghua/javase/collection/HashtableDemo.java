package cn.edu.tsinghua.javase.collection;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");
        hashtable.put(1, "hi");
//        hashtable.put(null, "hi");
//        hashtable.put(1, null);

        System.out.println(hashtable.size());
    }
}