package cn.edu.tsinghua.javase.oop;

//类的类型可以为public 或者什么类型都没有缺省
public class AccessModifierTest { //alt + 7 查看类结构

    // public 公有
    // private 私有
    // protected 保护
    // default 缺省 package-private

   /* 访问限定修饰符
            类的访问限定修饰符
    default class 只有同包的其他类可访问
    public class 外包的类可访问，需导入，
    常用类成员的访问限定修饰符
    private 私有的，只有同一个类内部可访问
    default 默认的，只有同一个包内部可访问
    protected 受保护的，外包中子类的实例对象可访问
    public 共有的，外包可访问*/


    private int i;
    protected double d;
    boolean b;
    public String s;

    private void m1() {
        i = 0;
        System.out.println(i);
    }

    protected void m2() {

    }

    void m3() {

    }

    public void m4() {

    }



}
/*
class AccessModifierTest{ //什么类型都没有的类，只能同包下的类才能访问，其他包下的类不能访问

}*/
