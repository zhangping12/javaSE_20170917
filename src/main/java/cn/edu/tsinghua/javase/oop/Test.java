package cn.edu.tsinghua.javase.oop;

public class Test extends Object {

    public void test() {
        System.out.println("oop Test class...");
    }

    public static void main(String[] args) {
        Test test = new Test();

        AccessModifierTest accessModifierTest = new AccessModifierTest();
//        System.out.println(accessModifierTest.i);
        System.out.println(accessModifierTest.d);
        System.out.println(accessModifierTest.b);
        System.out.println(accessModifierTest.s);

//        accessModifierTest.m1();
        accessModifierTest.m2();
        accessModifierTest.m3();
        accessModifierTest.m4();

        Calculator calculator = new Calculator(100,10);//利用构造器的方式

        System.out.println(calculator.getY());

        System.out.println(calculator.divide());

        calculator.setX(100);
        calculator.setY(10);

        System.out.println("done.");

    }
}