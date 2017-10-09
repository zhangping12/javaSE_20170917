package cn.edu.tsinghua.javase.exercise;

//将圆周率定义为常量，编写一个求圆面积的方法，调用此方法来求圆的面积
public class OOE4 {

    public static void main(String[] args) {
        System.out.println("圆的面积是:"+area(4));
    }

    static double area(double r){
        double pai = 3.1415926;
        double area = pai*r*r;
        return area;
    }
}
