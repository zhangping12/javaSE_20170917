package cn.edu.tsinghua.javase.exercise;

import java.util.Scanner;

//输入三个整数x，y，z，请把这三个数由小到大输出。
public class E15 {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int x = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int y = scanner.nextInt();
        System.out.println("请输入第三个整数：");
        int z = scanner.nextInt();
        if (x>y){
             n = x;
             x = y;
             y = n;
        }
        if (x>z){
             n = x;
             x = z;
             z = n;
        }
        if (y>z){
             n = y;
             y = z;
             z = n;
        }
        System.out.println("small to big:"+x+","+y+","+z);
    }
}
