package cn.edu.tsinghua.javase.oop;

public interface InterfaceTest {

    /**
     * 接口可以定义域和方法
         接口的域都是公有常量
         接口的方法都是公有抽象方法
     */
    int ZERO = 0;//相当于 public static final int ZERO = 0 ;在接口只能是共有的

    void method();//相当于public abstract void method();


}
