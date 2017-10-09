package cn.edu.tsinghua.javase.exercise;
//定义一个学生类，包含三个属性（学号，姓名，成绩）均为私有的，分别给这三个属性定义两个方法，一个设置它的值，另一个获得它的值。
// 然后在一个测试类里试着调用
public class OOE5 {
    private String stuno;
    private String name;
    private double grade;

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
