package cn.edu.tsinghua.javase.basic;

//位运算符
public class BitwiseOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        int z = x & y;//x 按位与 y ，结果为0
        z = x | y;//结果为1
        z = x ^ y;//结果为1,结果不同才为1
        z = ~ x;//等价于-x-1，结果为-2
        z =  x << 1;//等价于x左移1位，结果为2
        z =  x << 2;//等价于x左移2位，结果为4
        z = x >>> 1;//无符号右移
        z = x >> 1;//有符号右移

        //binary 二进制  0 1 10
        //decimal 十进制 0 1 2


        // 0001
        // 0000
        // 0000
        // 0001
        // 0001
        // 0010
        // 0100

        // 0100
        // 0010

        //  01111111111111111111111111111111 2^31-1
        System.out.println(z);
    }

}
