public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 19;
        int y = 100;

        int z = x+y;
        z = x-y;
        z = x*y;
        z = x/y;//截取余数 结果为0
        z = x%y; //mod 求余运算，只要余数，符号只与被除数有关.-19%-100=-19；-19%100=-19；19%-100=19；19%100=19

        System.out.println(z++);
        System.out.println(z);

       //+ 在数值与字符串中的运算规则, + 的运算顺序是从左至右，其他类型与字符串的 + 为字符串拼接
        System.out.println(1+2);//结果是3
        System.out.println(1+"2"+3);//结果是123
        System.out.println(1+2+"3");//结果是33
        System.out.println("3"+1+2);//结果是312

    }
}
