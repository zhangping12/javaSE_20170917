package cn.edu.tsinghua.javase.collection;

public class OverrideTest extends Object {


    public static void main(String[] args) {
        OverrideTest overrideTest = new OverrideTest();
        System.out.println(overrideTest.toString()); // 隐式
    }

    @Override
    public String toString() {
        return "zhangsan";
    }

    // Object hashCode() equals() toString()
}