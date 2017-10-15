package cn.edu.tsinghua.javase.collection;

public class Array2D {
    public static void main(String[] args) {
        int[][] ints = new int[3][5];

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i + j;
                System.out.print(ints[i][j]+"\t");
            }
            System.out.println();

        }
        System.out.println("------");

        //第一种，输出不规则的数组，每行的值的个数不同
        String[][] strings =new String[3][];
        strings[0] = new String[5];//第一行5个值
        strings[1] = new String[4];//第二行4个值
        strings[2] = new String[3];//第三行3个值

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = i + "" + j;
                System.out.print(strings[i][j]+"\t");
            }
            System.out.println();

        }

        //第二种，输出不规则的数组，每行的值的个数不同
       double[][] doubles = {
               {1.1,2.1,3.1}, //第一行的个数值
               {4.2,5.2},//第二行的个数值
               {7.3}//第三行的个数值
       };
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                System.out.print(doubles[i][j]+"\t");
            }
            System.out.println();

        }
        System.out.println();


    }
}
