package cn.edu.tsinghua.javase.collection;

public class Array3D {
    public static void main(String[] args) {
        int[][][] vector = new int[3][5][7];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                for (int k = 0; k < vector[i][j].length; k++) {
                    vector[i][j][k] = i + j + k;
                    System.out.print(vector[i][j][k]+"\t");
                } // 最大维度255
                System.out.println();
            }
        }
    }
}
