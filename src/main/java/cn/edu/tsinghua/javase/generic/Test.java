package cn.edu.tsinghua.javase.generic;

import java.io.Serializable;

public class Test<T extends Serializable> {//序列化

    public T test(T x) {
        // ...
        return x; // true + false = ?
    }

    public static void main(String[] args) {
        Test<A> ta = new Test<>();
        System.out.println(ta.test(new A()));

//        Test<C> tc = new Test<>();
//        System.out.println(tc.test(new C()));
    }
}

class A implements Serializable {

}

class C {

}