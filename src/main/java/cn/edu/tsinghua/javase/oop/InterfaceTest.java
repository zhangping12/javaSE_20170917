package cn.edu.tsinghua.javase.oop;
/**
 与类处于同一个级别
 接口的定义
     访问限定修饰符 interface 接口名
     [<类型参数列表 extends 父类型名 & 父类型名 & ...>]
     [extends 父接口名列表] {
     // 接口体
     }
 接口没有构造方法，不能实例化
 抽象类与接口之间的联系和区别：
     相同点
         - 都不能实例化
         - 都可以定义抽象方法
         - 对于他们的子类 / 实现类做了限制和约束
     不同点
         - 接口的域都是公有常量，抽象类都可以
         - 接口没有构造方法，抽象类有
         - 接口不能定义非抽象方法，抽象类可以
         - Java 语言的类只能继承一个抽象类，但可以实现多个接口
         - 接口本身可以扩展 extends 多个父接口
 */

public interface InterfaceTest {

    /**
     * 接口可以定义域和方法
         接口的域都是公有常量
         接口的方法都是公有抽象方法
     */
    int ZERO = 0;//相当于 public static final int ZERO = 0 ;在接口只能是共有的

    void method();//相当于public abstract void method();

}

class  InterfaceTestImpl implements InterfaceTest{//接口是用来被实现的 implements


    @Override
    public void method() {

    }
}

    interface A {
        void a();
    }

    interface B {
        void b();
    }

    interface C {
        void c();
    }

    interface D {
        void d();
    }


class AbcdImpl implements A, B, C, D {//接口的实现类AbcdImpl，类实现接口必须实现接口的所有抽象方法，
    // Java 中，一个类可以实现多个接口
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}

interface E extends A, B, C, D { //接口E继承了接口A, B, C, D
    void e();
}

class EImpl implements E {//实现类EImpl就要实现接口E的所有方法
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    @Override
    public void e() {

    }
}