public class SwitchCaseTest {
    public static void main(String[] args) {
        String level = "A";

        switch(level){ //switch括号内的内容有类型限制 byte char int short enum String(JDK 1.7+)
            case "A":
                System.out.println("85-90");
                break;
            case "B":
                System.out.println("70-85");
                break;
            case "C":
                System.out.println("60-70");
                break;
            case "D":
                System.out.println("0-60");
                break;
            default:
                System.out.println("ERROR.");
                break;
        }
    }
}
