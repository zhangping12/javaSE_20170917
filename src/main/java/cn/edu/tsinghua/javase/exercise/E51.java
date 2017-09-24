package cn.edu.tsinghua.javase.exercise;

import java.util.Scanner;

// 斐波那契数列：0，1，1, 2, 3, 5, 8, 13, 21, ..., 求f(n)
// f(n) = 0 (n = 1)
// f(n) = 1 (n = 2)
// f(n) = f(n-1) + f(n-2) (n > 2)
// 递归 recursive
public class E51 {

    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input n: ");
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
    }
}
