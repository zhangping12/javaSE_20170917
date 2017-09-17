//布尔逻辑运算符
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a & b;
        c = a | b;
        c = a ^ b;//异或，a b 不一样才为true
        c = !a;
        c = a && b;
        c = a || b;

        System.out.println(c);

        int x = 1;
        int y = 0;

        boolean z =(x>y)|(x++ == y);//x为2
      //  boolean z =(x>y)||(x++ == y);//x为1

    /*     &&，||与&，|的区别如下：
         &&和||第一个表达式即可确定运算结果时，不再判断第二个表达式
        使用短路规则与否，可能副作用不同*/

        System.out.println(z);
        System.out.println(x);
    }
}
