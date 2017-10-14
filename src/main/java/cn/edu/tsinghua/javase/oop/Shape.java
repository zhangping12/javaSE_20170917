package cn.edu.tsinghua.javase.oop;

public  abstract class Shape {

    //面积
    public abstract double area();

    //周长
    public abstract double circumference();
    //Square Circle Triangle Retangle


}
//正方形
class Square extends Shape {
    private double length;

    public Square(double length) {//构造方法
        this.length = length;//把参数length 赋值给 this代表当前的length
    }

    @Override
    public double area() {
      return length*length;

    }

    @Override
    public double circumference() {
        return length*4;
    }
}
//圆形
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;

    }

    @Override
    public double circumference() {
        return Math.PI * radius * 2;

    }
}
//三角形
class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (!((a + b) > c && (b + c) > a && (c + a) > b)) {
            System.out.println("Error.");
            System.exit(0);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = circumference()/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // square root

    }

    @Override
    public double circumference() {
        return a+b+c;

    }
}
//长方形
class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
     return width*height;
    }

    @Override
    public double circumference() {
        return (width+height)*2;
    }
}

//测试类
class ShapeTest {

    public static void main(String[] args) {
        Square square = new Square(1.2);//建实例的时候，需要有个构造方法能传个参数，引用的就是Square的构造方法
        System.out.println(square.area());
        System.out.println(square.circumference());

        Triangle triangle = new Triangle(1, 4, 5);
        System.out.println(triangle.area());
        System.out.println(triangle.circumference());

    }
}