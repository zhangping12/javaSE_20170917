/**/
package cn.edu.tsinghua.javase.basic; // 打包

import cn.edu.tsinghua.javase.oop.Asian; // 导包
import cn.edu.tsinghua.javase.oop.Human;

import java.util.Scanner;

//import java.lang.String;

public class Test {

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


}