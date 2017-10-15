package cn.edu.tsinghua.javase.collection;

public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");

        String s = stringBuffer.toString();//stringBuffer转换成string

        String s1 = "hi";

        StringBuffer stringBuffer1 = new StringBuffer(s1);//string转换为stringBuffer

       //stringBuffer缓存区，赋值过，下一个方法调用时，还是上一个方法的值
        System.out.println(stringBuffer1.append(123).append(true));//hi123true
        System.out.println(stringBuffer1.delete(2, 5));//hitrue 删除了[2,5)就是123
        System.out.println(stringBuffer1.insert(2, 123)); // offset 抵消\ ['ɒfset] 在上面的值hitrue基础上加上123，
                                                                   // 变为hi23true
        System.out.println(stringBuffer1.reverse()); // 反向\ [rɪ'vɜːs]//在hi23true基础上变为eurt321ih
        //将给定索引处的字符设置为 ch。在eurt321ih给索引1处的u，设置为a，所以结果为eart321ih
        stringBuffer1.setCharAt(1, 'a');//因为方法没有返回值，void ，所以不能写在System.out.println，
                                                  // 而是直接给stringBuffer1改值，然后打印出stringBuffer1
        System.out.println(stringBuffer1);//eart321ih
    }
}