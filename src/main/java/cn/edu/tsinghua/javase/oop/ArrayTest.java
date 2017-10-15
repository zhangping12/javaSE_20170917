package cn.edu.tsinghua.javase.oop;

public class ArrayTest {

    public static void main(String[] args) {

        int[] ints;
        boolean[] booleans;

        ints = new int[10];//可以存放10个值

        booleans = new boolean[1000];

        String[] strings =new String[5];

        System.out.println(ints[0]);//默认值0
        System.out.println(booleans[0]);//默认值false
        System.out.println(strings[0]);//默认值null

        ints[0] = 123;
        System.out.println(ints[0]);//123

        for (int i = 0; i < ints.length; i++) { //length相当于数组类型的域，而不是方法
            ints[i] = i;
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
