package cn.edu.tsinghua.javase.oop;

/**
 * 可以修饰域和方法
 */
public class StaticTest {

    private static int i;//如果不加static ，jerry.i为0，加了修饰符static，jerry.i就为1，原因在于static修饰的i属于类对象，
    // 所以，jerry.i就是StaticTest.i ,同理tom.i也是StaticTest.i
    private String name;

    public static void method() {

    }

    public static void main(String[] args) {
        StaticTest tom = new StaticTest();
        tom.name = "Tom";
        tom.i = 1;

        System.out.println(tom.name);
        System.out.println(tom.i); // 1

        StaticTest jerry = new StaticTest();
        jerry.name = "Jerry";

        System.out.println(jerry.name);
        System.out.println(jerry.i); // 0的结果是i不加static修饰符
    }
}