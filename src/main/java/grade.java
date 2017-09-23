import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "input int score:");
         char grade ;
         int score =scanner.nextInt();
       //  int score =50;
      //   grade = score >= 90 ? 'A' : score >= 60 ? 'B' : 'C';
      //   System.out.println(grade);
        System.out.println((score >= 90) ? 'A' :( score >= 60) ? 'B' : 'C');
    }


}
