package cn.edu.tsinghua.javase.exercise;
//定义一个人类，包含姓名、性别、年龄等信息。所有的变量必须私有。其他类只能通过该类的方法获取和修改。实例化一个人类，
// 试着通过该类的方法修改实例化的人的信息
public class OOE3 {
    private String name;
    private char sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    OOE3 hunman = new OOE3();
   // hunman.getAge();
}
