package cn.edu.tsinghua.javase.exercise;
//有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13…求出这个数列的前20项之和。
public class E20 {
    public static void main(String[] args) {
        double a=2, b;
        double sum ;
        sum = a;
        for (int i = 1; i < 20; i++) {
            b = 1+1/a;
            a = b;
            sum += b;
        }
        System.out.println("前20项之和："+sum);
    }
}
