package cn.edu.tsinghua.javase.exercise;
//一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
public class E13 {
    public static void main(String[] args) {
        long x, y;
        for (int i = 1; i <= 1000; i++) { //表示一个 1000 以内的整数
            x = (long) Math.sqrt(i + 100);
            y = (long) Math.sqrt(i + 268);
            if (x * x == (i + 100) && y * y == (i + 268)) {
                System.out.println(i);
            }
        }
    }
}