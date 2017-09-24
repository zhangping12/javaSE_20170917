package cn.edu.tsinghua.javase.oop;

public class Asian extends Human {

    public Asian(String name) {

        super(name);
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("haha");
    }
}
