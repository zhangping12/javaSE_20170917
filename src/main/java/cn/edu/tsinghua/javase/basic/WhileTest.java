package cn.edu.tsinghua.javase.basic;

public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10){
            if(i==5){
              //  break;//结果为0 1 2 3 4
                i++;
               continue;
            }
            System.out.println(i);
            i++;
        }

       /* do{//至少执行循环体一次
            System.out.println(i);
            i++;
        }while(i<10);*/

    }
}
