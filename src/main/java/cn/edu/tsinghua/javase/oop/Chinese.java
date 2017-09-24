package cn.edu.tsinghua.javase.oop;

public class Chinese extends Human {//创建一个类的子类，这个类必须有默认的无参构造器

    String hairColor = "";
    String shengxiao = "";


    //子类必须显式调用父类的有参构造方法
    //子类显式调用父类构造方法时，必须在其构造方法的第一行
    public Chinese(String name, int age, char gender, double height, double weight, boolean married,String shengxiao,String hairColor) {
        super(name, age, gender, height, weight, married);//调用父类的构造方法不需要加.
       // super.study() 调用父类的成员方法需要加.
        this.shengxiao = shengxiao;//参数值传给当前类的域中的shengxiao
        this.hairColor = hairColor;//参数值传给当前类的域中的hairColor ，如果在定义域的时候已经赋值，
        // 则不需要在写入参数和写此句话，直接调用即可
    }

    void speakChinese(){

    }

   /* cn.edu.tsinghua.javase.oop.Chinese(){
        super();//this     super代表当前类的父类   父类如果有无参构造方法子类可以隐式调用
    }*/

   //动态多态性的例子


    @Override
    void eat() {
        super.eat();
        System.out.println("吃饭");
    }

    public static void main(String[] args) {
        Chinese chinese = new Chinese("zhangsan",17,'M',170,70,false,"Tiger","black");//首先要创建实例，才能调用域和方法
        System.out.println(chinese.name);
        System.out.println(chinese.study("JAVA SE"));
        System.out.println(chinese.shengxiao);
        System.out.println(chinese.height);
        System.out.println(chinese.hairColor);
        chinese.speakChinese();//因为返回值为空，所以不能添加到


        //chinese.eat();//直接显示父类的eat方法的值,结果为eat...
        chinese.eat();//重写eat方法 ，输出吃饭 子类和父类之间，
        //子类 重写 overwrite / 覆盖 override 了父类的方法（有相同的声明，访问权限可扩大）


        //可以创建父类的实例，但是父类的实例只能调用父类的域和方法，不能调用子类独有的域和方法
        Human human = new Human();

        //instanceof 判断对象是否是类的实例
        System.out.println(chinese instanceof Chinese);//结果为true
        System.out.println(chinese instanceof Human);//结果为true，子类的实例是属于父类的实例

       // cn.edu.tsinghua.javase.oop.Human chinese = new cn.edu.tsinghua.javase.oop.Human("Lisi");


       // cn.edu.tsinghua.javase.oop.Human human = new cn.edu.tsinghua.javase.oop.Human("");

        System.out.println(human instanceof Chinese);//结果为false


    }
}
