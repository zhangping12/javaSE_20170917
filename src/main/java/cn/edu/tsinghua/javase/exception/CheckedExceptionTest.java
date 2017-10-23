package cn.edu.tsinghua.javase.exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CheckedExceptionTest {

    public void method() throws FileNotFoundException {//抛出的异常，如果在下面已经处理了，在调用的话就不需要抛出了，否则的就得抛

    }

    public void m1() {
        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void m2() {
        m1();
    }

    public static void main(String[] args) { // JVM

        CheckedExceptionTest test = new CheckedExceptionTest();
        test.m2();

        Scanner scanner = new Scanner(System.in);
        System.out.println("input file name: ");
        String file = scanner.nextLine();
//        System.out.println(file);

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r"); //  read write
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("done.");

        // FileNotFoundException -> Checked Exception 受检异常  不可控的 ，用户输入  new RandomAccessFile(file
        // IllegalArgumentException -> Unchecked Exception 非受检异常 属于程序的bug new RandomAccessFile "r")
    }
}