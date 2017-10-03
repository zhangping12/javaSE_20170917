package cn.edu.tsinghua.javase.exercise;
//一个数如果恰好等于它的因子之和，这个数就称为’完数’。例如6=1＋2＋3.编程 找出1000以内的所有完数。
public class E9 {
    public static void main(String[] args) {
        for(int i = 2;i < 1000;i++){
            int sum = 0 ;
            //查找因数
            for (int j = 1;j < i;j++){
               if (i%j==0){
                   sum += j;

               }
            }
            if(sum == i){
                System.out.println(i);
            }

        }
    }
}
