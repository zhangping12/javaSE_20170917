package cn.edu.tsinghua.javase.collection;

public class ArrayTest {

    public static void main(String[] args) {

        int[] ints;
        boolean[] booleans;

        ints = new int[10];//可以存放10个值

        booleans = new boolean[1000];

        String[] strings =new String[5];
        double[] doubles = {1.2,3.4,5.6};
        System.out.println("---"+doubles.length);

        System.out.println(ints[0]);//默认值0
        System.out.println(booleans[0]);//默认值false
        System.out.println(strings[0]);//默认值null

        ints[0] = 123;
        System.out.println(ints[0]);//123

        for (int i = 0; i < ints.length; i++) { //length相当于数组类型的域，而不是方法
            ints[i] = i;
        }

        for (int i = 0; i < ints.length; i++) {//全部循环出来使用foreach，但是如果输出其中的就要用fori，因为有下角标
            System.out.println(ints[i]);
        }
        //将鼠标放在上面的for上面，按住alt+enter，变成foreach
        for (int anInt : ints) {//全部循环出来使用foreach，但是如果输出其中的就要用fori，因为有下角标
            System.out.println(anInt);
        }


        //iter+tab增强for循环（foreach循环）
        for (double aDouble : doubles) {

        }

    }
}
