package cn.edu.tsinghua.javase.exception;

public class Test {
    public static void main(String[] args) {

//        int x = 1 / 0; // ArithmeticException

//        System.out.println("hi".charAt(2)); // StringIndexOutOfBoundsException

//        int[] ints = {1, 2, 3};
//        System.out.println(ints[3]); // ArrayIndexOutOfBoundsException

//        String s = "l23";
//        System.out.println(Integer.parseInt(s) - 1); // NumberFormatException

//        String s = "hi";
//        s = null;
//        System.out.println(s.indexOf('h')); // NullPointerException

        try {
            int i = 1 / 1;
            System.out.println("demo..."); //
            System.out.println("hi".charAt(2));//这个异常被第三个catch捕获，所以输出here
        } catch (ArithmeticException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (IndexOutOfBoundsException e) {
            System.out.println("here...");
        } finally {

        }

        System.out.println("test");
    }
}

/*
java.lang.ArithmeticException: / by zero
	at cn.edu.tsinghua.javase.exception.Test.main(Test.java:26)
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at cn.edu.tsinghua.javase.exception.Test.main(Test.java:26)
 */