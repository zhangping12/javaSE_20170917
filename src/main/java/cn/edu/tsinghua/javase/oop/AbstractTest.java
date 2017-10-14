package cn.edu.tsinghua.javase.oop;

/**
 * 可以修饰类和方法
     抽象类
     抽象的类不能实例化
     抽象的类是用来被扩展的
     抽象类的子类必须实现抽象类中所有的抽象方法
 抽象方法
     抽象的方法没有实现
     抽象的方法必须声明在抽象类中
     在抽象类的子类中被实现
 */
public abstract class AbstractTest {

    public abstract void method();

    public static void main(String[] args) {
//        AbstractTest abstractTest = new AbstractTest();
    }
}

class SubAbstractTest extends AbstractTest {//子类要想继承抽象的父类，要不子类是抽象类，要不子类继承父类的所有抽象的方法

    @Override
    public void method() {

    }
}