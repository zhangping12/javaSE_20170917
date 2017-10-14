package cn.edu.tsinghua.javase.oop;

public class ParameterPass {
    /**
     * 值传递
         传递参数的值
         方法的参数是基本数据类型 primitives(8种)
         方法中的改变不影响实际参数 references 例子如下：
     * @param i
     */
   /* private static void method(int i) {
        System.out.println(i); // 0
        i++;
        System.out.println(i); // 1
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println(i); // 0
        method(i);
        System.out.println(i); // 0
    }*/

   /*private static void method(boolean i) {
       System.out.println(i); // 0
       i = false;
       System.out.println(i); // 1
   }

    public static void main(String[] args) {
        boolean i = true;
        System.out.println(i); // 0
        method(i);
        System.out.println(i); // 0
    }*/
    /**
     * “引用传递”

         传递参数的地址（也是值传递）
           Is Java “pass-by-reference” or “pass-by-value”?

         方法的参数是引用数据类型

         方法中的改变会影响实际参数

         注意：String类型以及基本数据类型的封装类是特例（还是值传递）

             String immutable
             primitive Wrapper
     */
    /*private int i;

    public ParameterPass(int i) {//有参构造方法
        this.i = i;
    }
    //set和get方法，成员方法
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    //静态方法
    private static void method(ParameterPass parameterPass) {//括号里面必须定义参数的类型，这个是引用类型
        System.out.println(parameterPass.getI()); // 0
        parameterPass.setI(1);
        System.out.println(parameterPass.getI()); // 1
    }

    public static void main(String[] args) {
        ParameterPass parameterPass = new ParameterPass(0);//引用有参构造方法
        System.out.println(parameterPass.getI()); // 0
        method(parameterPass);
        System.out.println(parameterPass.getI()); // 1
    }*/

    /**
     * 注意：String类型以及基本数据类型的封装类是特例（还是值传递）
           String immutable（不可改变的）
           primitive Wrapper
     * @param i
     */
    private static void method(String i) {
       System.out.println(i); // 你好，
       i += "中国";
       System.out.println(i); // 你好，中国
   }

    public static void main(String[] args) {
        String i = "你好，";
        System.out.println(i); // 你好，
        method(i);
        System.out.println(i); //  你好，中国
    }

}