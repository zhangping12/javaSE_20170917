package cn.edu.tsinghua.javase.generic;

import java.util.Vector;

/*
泛型的好处：1、节省代码量；2、省去强制转换，避免了强转的风险
 */
public class GenericTest<T> { // Type parameter list
    // generic 通用的\ [dʒɪ'nerɪk] 泛型 JDK5 Tiger
    // general 一般\ ['dʒen\(ə\)r\(ə\)l]
/*
    public String concat(int x, int y) {
        return String.valueOf(x) + String.valueOf(y);
    }
    public String concat(double x, double y) {
        return String.valueOf(x) + String.valueOf(y);
    }
    public String concat(boolean x, boolean y) {
        return String.valueOf(x) + String.valueOf(y);
    }
*/

    public String concat(T x, T y) {//上面注释掉的3个内容可以用这段代替
        return String.valueOf(x) + String.valueOf(y);
    }

    public static void main(String[] args) {
        GenericTest<Integer> genericTest = new GenericTest<>();
        System.out.println(genericTest.concat(1, 2));//12

        GenericTest<Double> genericTest1 = new GenericTest<>();
        System.out.println(genericTest1.concat(1d, 2d));//1.02.0

        GenericTest<Boolean> genericTest2 = new GenericTest<>();
        System.out.println(genericTest2.concat(true ,false));//truefalse

        //举例说明泛型的好处
        Vector<String> vector = new Vector<>();
//        vector.add(true);
        vector.add("hi");
        vector.add("hello");

        System.out.println(vector.size());//2
        String s = vector.get(0); // cast Type safe
        System.out.println(s);//hi

        GenericTest<String> test = new GenericTest<>();
        System.out.println(test.concat("hello", " world"));//hello world
    }

}