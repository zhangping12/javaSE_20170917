package cn.edu.tsinghua.javase.oop;

//类 = 域 + 方法
//class =fields + methods
public class Human {

    //fields域的定义
    String name;  //域直接定义在类体中
    int age;
    char gender;
    double height;
    double weight;
    boolean married;

    Human(){//无参构造方法，默认不显示且存在 default constructor

    }

    void eat(){
        System.out.println("eat...");
    }

    // Command + N | Alt + Insert |联想thinkpad Alt + Fn +i 用于生成构造方法

    public Human(String name) {
        this.name = name;//this表示当前类
    }

    public Human(String name, int age, char gender, double height, double weight, boolean married) {//有参的构造方法
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.married = married;
    }

    //方法 methods
    String study(String book){//void表示没有返回值，但不代表没有返回类型，返回类型void
        System.out.println(name + " read " + book);
        return "homework...";
    }

    void work(int hours, String device){
        System.out.println(name + " work " + hours + " hours, with " + device);
    }

    int walk(){
        // ...
        return 100;
    }


    public static void main(String[] args) {// Command + P | Ctrl + P (Parameter)
        Human tom = new Human("Tom", 18, 'M', 1.7, 60, false);//object instance new后面是构造方法
        //.
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.gender);
        System.out.println(tom.height);
        System.out.println(tom.married);

        System.out.println(tom.study("Java SE"));//含有返回值类型，所以结果要显示return的值
        tom.work(8, "computer");//由于没有返回值，所以不能放在System.out.println中

        Human jery = new Human("Jerry");

    }
}
