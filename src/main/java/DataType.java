public class DataType {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println(b);

        byte b1 = 1;//1024 = 1kb 1024T = 1PB bit 比特 1 0
        System.out.println(b1);

        char c = '中';
        System.out.println(c);

        short s = 100;
        int i = 999;
        long l = 10000;

        System.out.println(s+i+l);

        float f = 1.2f;
        double d = 1.2345;
        System.out.println(f);
        System.out.println(d);

        String s1 = "test...中文...";//class
        System.out.println(s1);

        String name = "ZHANGSAN";
        int age = 18;
        double height = 1.7;
        boolean married = false;

        long test;
        test = 100;
        test = 1000;
        System.out.println(test);

        int x = -2147482648;//2^31-1(-2^31)
        System.out.println(x);

        long y = -2147483648L;
        System.out.println(y);

        char c1 = 65535;//character [0,65535]
        c1 = '&';
        c1 = '\107';//0-7 8^2*1 + 8^1*0 + 8^0*7 8进制  \000 ~ \377
        c1 = '\u9fbb';//Hx 0-9 a,b,c,d,e,f [4E00,9FBB] 16进制 unicode 字符
        c1 = '\t';//tab
        c1 = '\n';//换行
        c1 = '\'';//转义字符单引号
        c1 = '\"';//双引号
        c1 = '\\';//反斜杠
        System.out.println(c1);


    }
}
