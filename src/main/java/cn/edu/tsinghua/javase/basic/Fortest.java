package cn.edu.tsinghua.javase.basic;

public class Fortest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i ==5){
          //      break;//break 中断之后的所有循环
                continue; //continue中断本次循环
            }
            System.out.println(i);
        }
        /*
        * step1.先输入fori+Tab
        * step2.输入i==50 按Ctrl + Alt + T,然后按4键，显示如下：
        * */
        /*for (int i = 0; i <100 ; i++) {
            if (i == 50) {

            }
        }*/

        //数组引用的循环
        int[] ints = {-1, 0, 100, 999};
        for(int i : ints){
            System.out.println(i);
        }
    }
}
