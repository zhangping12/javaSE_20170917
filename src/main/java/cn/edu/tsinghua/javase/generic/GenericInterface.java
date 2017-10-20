package cn.edu.tsinghua.javase.generic;

import java.io.Serializable;

public interface GenericInterface<T extends Serializable, E, S, U, V> {
    V method(T t, E e, U u);
}

//class GenericImpl<T> implements GenericInterface<T> { //实现类<>中的内容要与接口<>的内容一致，implements后面的接口，只需要
                                                        //写参数，不用写extends Serializable 如下所示
//
//    @Override
//    public T method(T t) {
//        return null;
//    }
//}

class GenericImpl<T extends Serializable, E, S, U, V> implements GenericInterface<T, E, S, U, V> { // *****
    @Override
    public V method(T t, E e, U u) {
        return null;
    }
}
