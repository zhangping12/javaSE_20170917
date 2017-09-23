public class BreakTest {
    public static void main(String[] args) {
        test: // label
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    //break;//break,只能中断离它最近的for循环就是j循环，如果想要中断所有的循环，
                    // 就需要在最外层循环加个label标签，例如Test ，然后写法如下，就可以中断所有循环
                    break test;
                }
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
