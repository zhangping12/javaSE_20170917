package cn.edu.tsinghua.javase.oop;

public class Polymorphism {

    int add(int x ,int y){
        return x + y;
    }



    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        System.out.println(polymorphism.add(1,2));
    }
}
