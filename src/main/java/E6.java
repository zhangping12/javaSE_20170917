import java.util.Scanner;
// 输入两个正整数m和n，求其最大公约数和最小公倍数
public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input m: ");
        int m = scanner.nextInt();
        System.out.println("input n: ");
        int n = scanner.nextInt();

        int min = Math.min(m, n);//求两个数之间的最小数
        for (int i = min; i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("Greatest Common Divisor: " + i);//求最大公约数
                break;
            }
        }

        int max = Math.max(m, n);//求两个数之间的最大数
        for (int i = max; i < m*n + 1; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("Lowest Common Multiple: " + i);//求最小公倍数
                break;
            }
        }
    }
}

/*
public class E6 {
    public static void main(String[] args) {
        // 12 10 最小公约数2 最小公倍数60
        Scanner scanner = new Scanner(System.in);
        System.out.println( "input m:");
        int m =scanner.nextInt();
        System.out.println( "input n:");
        int n =scanner.nextInt();
        if(m<n){
            int temp=n;
            n=m;
            m=temp;
        }
        System.out.println("最大公约数是："+caculate(m,n));
        System.out.println("最小公被数是："+m*n/caculate(m,n));
    }
    public static  int caculate(int m,int n){
        int temp ;
        if(m%n==0){
            temp=n;
        }else{
            temp=caculate(n,m%n);
        }
        return temp;
    }
}
*/
