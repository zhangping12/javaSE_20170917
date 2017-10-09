package cn.edu.tsinghua.javase.exercise;
//编写一个立方体类，包含这样的属性：长度、宽度、高度等信息，通过方法来计算它的体积
public class OOE2 {
    double length;//长度
    double width;//宽度
    double height;//高度

    public static void main(String[] args) {
        System.out.println(capacity(1,2,4));
    }
//求体积
    static double  capacity(double length,double width,double height){
        double cap = length*width*height;
        return cap;
    }
}
