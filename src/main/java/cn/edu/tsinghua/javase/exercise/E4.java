package cn.edu.tsinghua.javase.exercise;

import java.util.Scanner;

//将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。
public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input m: ");
        int m = scanner.nextInt();
        int r = 0;
        //60 = 2*2*3*5
        for(int i = 2; i < m; i++){
            if(m%i==0){
              r = i;
              m = m/i;
            }
        }
        System.out.println(m+"="+r);
    }

}
