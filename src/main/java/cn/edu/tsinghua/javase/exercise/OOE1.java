package cn.edu.tsinghua.javase.exercise;

import java.util.Scanner;

//定义一个判断闰年的方法，在 main 方法中调用该方法判断输入的一个年份是否是闰年
public class OOE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int  year = scanner.nextInt();
        System.out.println(LeapYear(year));
    }

    //定义闰年的方法
    static String  LeapYear(int  year){
        if(year%400==0||year%4==0&&year%100!=0){
            //System.out.println(year+"是闰年！");
            return (year+"是闰年！");

        }else{
           // System.out.println(year+"不是闰年！");
            return (year+"不是闰年！");
        }

    }
}
