package cn.edu.tsinghua.javase.collection;

import java.util.ArrayList;

public class ArrayListTest extends ArrayList {
    // *****
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            strings.add("a");
            strings.add("a");
            strings.add("c");
        }

        System.out.println(strings.get(2));//c

        for (String string : strings) {
//            System.out.println(string);
        }

        System.out.println("--------->"+strings.size());//30000

        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
        }

      //  System.out.println(strings); // 没有get容量的方法，但有容量的概念

        ArrayList<Integer> integers = new ArrayList<>(100000);
        integers.add(1);
        integers.add(2);
        integers.add(3);

        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.addAll(integers);
        System.out.println(integers.contains(1));//是否包含1，true
        System.out.println("index: "+integers.indexOf(1));//1的值对应的索引为0
//        integers1.remove(1);
//        integers1.clear();
        integers1.set(0, 3);//将索引为0的值1改为3
        System.out.println(integers1.isEmpty());//判断是否为空，false
        for (Integer integer : integers1) {
            System.out.println(integer);//3 2 3
        }

        System.out.println(integers1.toString()); // 运用了java的多态，crtl+B查看ArrayList重写了父类的方法 [3,2,3]

//        integers1.removeRange

        ArrayListTest arrayListTest = new ArrayListTest();
        for (int i = 0; i < 10; i++) {
            arrayListTest.add(i);
        }
        arrayListTest.removeRange(1, 9);
        for (Object o : arrayListTest) {
            System.out.println(o);// 0 9
        }

        integers.trimToSize(); // 作用是将capacity = size 一般capacity > size

        ArrayList<OverrideTest> overrideTests = new ArrayList<>();
        //System.out.println(overrideTests.size());
        overrideTests.add(0,new OverrideTest());
        System.out.println("overrideTests == " +  overrideTests.toString());//必须先添加对象
        overrideTests.add(new OverrideTest());//添加对象
        overrideTests.add(new OverrideTest());
        overrideTests.add(new OverrideTest());
        overrideTests.add(new OverrideTest());

        System.out.println(overrideTests.size()); // 4

        for (OverrideTest overrideTest : overrideTests) {
            System.out.println(overrideTest.hashCode());//判断为啥有4个对象，因为不同的对象，对应的hashCode也不同
        }


    }
}