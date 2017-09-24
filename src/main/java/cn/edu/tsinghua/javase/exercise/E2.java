package cn.edu.tsinghua.javase.exercise;

// 判断[101,200]有多少个素数，并输出所有素数
// 素数：只能被1和它本身整除的正整数（1不是素数）
public class E2 {
    public static void main(String[] args) {  //由大到小
        int counter = 0;
        for (int i = 101;i < 201;i++){
            boolean isPrime = true;
            for (int j =2;j < i/2;j++){ // i/2 简化运算
                if(i%j==0){
                    isPrime = false;
                    break; //简化运算
                }
            }
            if(isPrime){
                counter++;
                System.out.println(i);
            }

        }
        System.out.println("counter；"+counter);

    }
}
