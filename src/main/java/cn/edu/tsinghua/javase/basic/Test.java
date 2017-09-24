/**/
package cn.edu.tsinghua.javase.basic; // 打包

import cn.edu.tsinghua.javase.oop.AccessModifierTest;
import cn.edu.tsinghua.javase.oop.Asian; // 导包
import cn.edu.tsinghua.javase.oop.Human;

import java.util.Scanner;

//import java.lang.String;

/* public class Test extends {

   public static void main(String[] args) {

        // FQN Fully Qualified Name 全限定名 (不同包的类跟当前类同一名字，引用方式如下)
        cn.edu.tsinghua.javase.oop.Test test = new cn.edu.tsinghua.javase.oop.Test();
        test.test();

        //引用不同包的类，并且类名不同，需要使用import导入包
        Asian asian = new Asian("");


        Human human = new Human("");

        String s = "hi";

//        Scanner

        System.out.println();
    }



}*/
 public class Test extends AccessModifierTest{

    public static void main(String[] args) {

        AccessModifierTest accessModifierTest = new AccessModifierTest();
//        System.out.println(accessModifierTest.i);
//        System.out.println(accessModifierTest.d);
//        System.out.println(accessModifierTest.b);
        System.out.println(accessModifierTest.s);

//        accessModifierTest.m1();
//        accessModifierTest.m2();
//        accessModifierTest.m3();
        accessModifierTest.m4();

        Test test = new Test();
        System.out.println(test.d);//如果想能调用不同包类下的受保护的域和方法，首先保证调用的类是public
        test.m2();                 //其次当前类继承调用的类，然后在使用当前类的实例去调用父类的受保护的域和方法
                                   //如左所示

    }
}