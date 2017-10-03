package cn.edu.tsinghua.javase.exercise;
//利用递归方法求5!。
public class E22 {
    public static void main(String[] args) {
        System.out.println(recursion(5));

    }
    public static long recursion(int n) {
        long value = 0 ;
        if(n ==1 || n == 0) {
        value = 1;
        } else if(n > 1) {
        value = n * recursion(n-1);
        }
        return value;
    }

}
