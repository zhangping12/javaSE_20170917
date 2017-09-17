//关系运算符
public class RelationalOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        boolean z = x>y;
        z = x < y;
        z= x >= y;
        z= x <= y;
        z= x == y;
        z= x != y;//!= 可用于任意类型比较
        System.out.println(z);

        String s1 = "hello";//== 可用于任意类型比较
        String s2 = "2";
        System.out.println(s1==s2);//false

        String s3 = "Hello";
        String s4 = "hello";
        System.out.println(s3==s4);//false

        String s5 = "hello";//== 可用于任意类型比较
        String s6 = "hello";
        System.out.println(s5==s6);//true
    }
}
