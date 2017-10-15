package cn.edu.tsinghua.javase.collection;

public class StringTest {
    public static void main(String[] args) {
        String s = "hello"; // 直接量
        System.out.println(s);

        byte[] bytes = new byte[10];
//        String s1 = new String(bytes, 1); // deprecated

        String s2 = new String("hello");
        String s3 = "hello";//一般都这样写


        System.out.println(s3.charAt(4));
        //concat:给当前的字符串后面加上指定的字符，将指定字符串连接到此字符串的结尾。
        System.out.println(s3.concat("String"));//helloString

        //contains:判断当前字符串是否含有指定字符，当且仅当此字符串包含指定的 char 值序列时，返回 true。
        System.out.println(s3.contains("hel"));//true

        //endsWith:测试此字符串是否以指定的后缀结束。
        //如果参数表示的字符序列是此对象表示的字符序列的后缀，则返回 true；否则返回 false。注意，如果参数是空字符串，
        // 或者等于此 String 对象（用 equals(Object) 方法确定），则结果为 true。
        System.out.println(s3.endsWith("lo"));//true
        System.out.println(s3.endsWith(""));//true

        //equals:将此字符串与指定的对象比较。
        System.out.println(s3.equals("hello"));//true
        System.out.println(s3.equals("HELLO"));//false

        //equalsIgnoreCase:将此 String 与另一个 String 比较，不考虑大小写。
        System.out.println(s3.equalsIgnoreCase("hello"));//true
        System.out.println(s3.equalsIgnoreCase("HELLO"));//true

        //format:使用指定的语言环境、格式字符串和参数返回一个格式化字符串。
        System.out.println(String.format(s3, "HELLO"));//???

        //1、getBytes:使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
       // System.out.println(s3.getBytes());

        //2、getBytes:使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。

        //3、getBytes:使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。

        //1、indexOf:返回指定字符在此字符串中第一次出现处的索引。
        System.out.println(s3.indexOf("e"));//1,索引1

        //2、indexOf:返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
        System.out.println(s3.indexOf("e",2));//-1
        System.out.println(s3.indexOf("e",0));//1

        //3、indexOf:返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。

        //4、indexOf：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。

        //isEmpty:当且仅当 length() 为 0 时返回 true。
        System.out.println(s3.isEmpty());//false

        //1、lastIndexOf:返回指定字符在此字符串中最后一次出现处的索引。
        System.out.println(s3.lastIndexOf("l"));//3

        //2、lastIndexOf:返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。

        //3、lastIndexOf:返回指定子字符串在此字符串中最右边出现处的索引。

        //4、lastIndexOf:返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。

        //length：返回此字符串的长度。
        System.out.println(s3.length());//5

        //matches： 告知此字符串是否匹配给定的正则表达式。
        System.out.println(s3.matches("e"));//false

        //1、replace：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
        System.out.println(s3.replace('l','a'));//heaao

        //2、replace：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。

        //replaceAll：使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
        System.out.println(s3.replaceAll("l","a"));//heaao

        //replaceFirst：  使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
        System.out.println(s3.replaceFirst("l","a"));//healo

        //split：根据给定正则表达式的匹配拆分此字符串。
        for (String s1 : s3.split("e")) { // 分裂\ [splɪt]
            System.out.println(s1);//h llo

        }

        //1、startWith：测试此字符串是否以指定的前缀开始。
        System.out.println(s3.startsWith("he"));//true

        //2、startWith：测试此字符串从指定索引开始的子字符串是否以指定前缀开始。

        //1、subString：返回一个新的字符串，它是此字符串的一个子字符串。
        System.out.println(s3.substring(2));//llo

        //2、subString：返回一个新字符串，它是此字符串的一个子字符串。
        System.out.println(s3.substring(2,4));//ll

        //toCharArray：将此字符串转换为一个新的字符数组。
        for (char c : s.toCharArray()) {// h e l l o
            System.out.println(c);
        }


        //1、toLowerCase：使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
        System.out.println(s3.toLowerCase());//hello

        //2、toLowerCase：使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。

        //1、toUpperCase：使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
        System.out.println(s3.toUpperCase());//HELLO

        //1、toUpperCase：使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。

        //trim：返回字符串的副本，忽略前导空白和尾部空白。
        System.out.println("    he ll o hi   ".trim()); // 修剪\ [trɪm] he ll o hi

        //valueOf：
        System.out.println(String.valueOf(123));//123

        String s1 = "123";
        int i = Integer.valueOf(s1);//或者可以用int i = Integer.parseInt(s1);
        System.out.println(i-3);

        String s4 = "hi";
        String s5 = "hi";
        String s6 = new String("hi");

        System.out.println(s4 == s5); // true 指的都是同一个地址
        System.out.println(s4 == s6); // false 指的不是同一个地址
    }

}