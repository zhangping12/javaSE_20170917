package cn.edu.tsinghua.javase.exercise;
//一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
public class E10 {
    public static void main(String[] args) {
       /* double total1 = 0.00;
        double total2 = 0.00;
        double x = 100.00;
        double y = 100.00;
        double c = 0.00;
        for (int i = 0; i <11 ;i++ ) {
            x=x/2.00;
            total1 += x;

        }
        for (int j = 0; j <10 ; j++) {
            y=y/2.00;
            total2 += y;
        }
        c = (total1 - total2);
        System.out.println("第10次落地时，共经过:"+total1+"米");
        System.out.println("第10次反弹:"+c+"米");*/
        double sn = 100;// 高度100米
        double hn = sn / 2; //第一次反弹反弹高度
        int i = 0;
        for (i = 2;i< 10;i ++){
            sn = sn + hn * 2; //第i次落地经过多少米
            hn = hn / 2;//第i次反弹的高度
        }

        System.out.println("第" + i + "次落地经过" + sn +"米");
        System.out.println("第" + i + "次反弹" + hn + "米");
    }
}
