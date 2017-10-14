package cn.edu.tsinghua.javase.oop;

public class Mankind {
    /**
     * 静态块 static block

     静态块在类加载时自动执行一次, 之后不再执行
     static {
     // ...
     }
     */
    static {
        System.out.println("static block");
    }

    private static String earth;
    private String name;
    /**
     * 静态并终态的域
             只能在声明时初始化
             初始化之后值不能再被修改
             常量，都是大写字母，单词之间用下划线 _ 分隔
       例子如下：
     */
    private static final int ONE_TWO_THREE = 123;// constant 常量

    public static void method(){
      //  name = "";//name 是不是静态成员，所以不能直接引用，引用如下，需要创建对象引用
        earth = "";//静态方法中只能直接引用静态成员
        Mankind mankind = new Mankind();
        mankind.name = "";//name的调用
    }

    public static void main(String[] args) {
        Mankind tom = new Mankind();
        tom.name = "Tom";
       // tom.earth ="tom 种了一棵树";
        Mankind.earth = "tom 种了一棵树";//静态的成员隶属于类对象,所以tom.earth相当于Mankind.earth

        System.out.println(tom.name);
        System.out.println(Mankind.earth);

        Mankind jerry = new Mankind();
        jerry.name = "Jerry";

        System.out.println(jerry.name);
        System.out.println(Mankind.earth); //静态的成员隶属于类对象
    }

}
