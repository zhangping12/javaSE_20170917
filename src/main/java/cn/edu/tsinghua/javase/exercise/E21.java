package cn.edu.tsinghua.javase.exercise;
//求1+2!+3!+…+20!的和。
public class E21 {
    public static void main(String[] args) {
        long sum=0;//因为数太大要定义成long类型
        long n=1;
        int i=1;
        for (i=1; i<=20 ;i++ )
            {
                n*=i;//此处是计算每个项的阶乘
                sum+=n;//此处是把每个项的阶乘数依次相加
            }
        System.out.println("所有阶乘数的和为:"+sum);


    }
}
