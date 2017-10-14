package cn.edu.tsinghua.javase.oop;

/**
 * 1、终态
   2、可以修饰类、域和方法
   3、终态的类不能再被子类化
   4、终态的域
      4.1、只能在声明时或所有构造方法中被初始化
      4.2、初始化之后值不能再被修改
   5、终态的方法不能在子类中被重写
   6、静态并终态的域
      6.1、只能在声明时初始化
      6.2、初始化之后值不能再被修改
      6.3、常量，都是大写字母，单词之间用下划线 _ 分隔
 */
public class FinalTest {
   // private final int i = 0;//静态域的第一种初始化

    private final int i;//创建一个final类型的域i，只能在声明时或所有构造方法中被初始化，初始化之后值不能再被修改

    //静态域的第二种初始化
    public FinalTest() {//无参构造方法 ，初始化
        i = 0;
    }

    public FinalTest(int i) {//有参构造方法
        this.i = i;
    }

    public final void method() {//定义的final类型的方法

    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();//创建一个无参的实例对象，引用无参构造方法
//        finalTest.i = 1;

        FinalTest finalTest1 = new FinalTest(1);//创建一个有参的实例对象，引用有参构造方法
    }
}

class SubFinalTest extends FinalTest {//子类继承final的父类，终态类（父类）的方法不能在子类中被重写
//    public void method() {
//
//    }
}
