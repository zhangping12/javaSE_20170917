public class IfTest {
    public static void main(String[] args) {

        int score = 70;
        score = 50;
        score = 40;
        score = 90;

        if(score >= 90)
            System.out.println("pefect");//if后面不加大括号可以控制后面的一句话而已

        if (score > 85) {
            System.out.println("A");
        } else if(score > 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        String result = (score >= 60)?"passed.":"failed.";

        System.out.println(result);

        System.out.println("done.");
    }
}
