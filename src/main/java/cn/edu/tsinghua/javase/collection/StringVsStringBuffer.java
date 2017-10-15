package cn.edu.tsinghua.javase.collection;

public class StringVsStringBuffer {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {

        String s = "";

        StringBuffer stringBuffer = new StringBuffer();

        long start = System.currentTimeMillis(); // 1970.1.1 - current
        for (int i = 0; i < 10000; i++) {
     //      s += ALPHABET;//用string执行//2284毫秒
            stringBuffer.append(ALPHABET);//用stringBuffer执行5毫秒
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);

        System.out.println(stringBuffer.length()); // 260000
    }
}
