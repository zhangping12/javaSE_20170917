public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 1;
        x += 1;//x ?= n等价于 x = x ? n; 二元运算符
        x = x + 1;

        x %= 1;//结果为0
        System.out.println(x);

      //  boolean a = true;
        int a = 1;
        a &=1;//a = a & 1; 结果为1
        //001  a的二进制
        //001  1的二进制
        System.out.println(a);
    }
}
