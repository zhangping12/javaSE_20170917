package cn.edu.tsinghua.javase.oop;

/**
 * 变量（方法）产生作用的有效范围
      类作用域范围
             类的起始 { 到类的终止 }
             类的域和方法
      块 block 作用域范围
             从变量声明之处，到当前块结束之处
             方法中的局部变量 local variable，方法的参数，循环的变量
 */
public class VariableScope {

    public void m() {//静态方法中只能直接引用静态成员方法，不是静态方法就无需是否静态都可以用
        i = 0;
        test(1d);//调用test方法
    }

    private static int i;// 类作用域范围：类的起始 { 到类的终止 } 类的域和方法。所以此句定义i变量在赋值之后不会报错，但是也不建议

    public static void test(double d) {
        System.out.println(d);
        String s = "hi"; // local variable
        System.out.println(s);
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        for (int j = 0; j < 10; j++) {//也不会跟上面的for循环重复，在于作用域不同
            System.out.println(j);
        }

//        int i = 10000;//此句放开，不会报错，原因在于方法内的局部变量可以覆盖同名的域，但是不建议这么做

        System.out.println(i);//静态方法中只能直接引用静态成员方法
    }

    public static void main(String[] args) {
        test(1d);//静态方法中只能直接引用静态成员方法
    }

}
