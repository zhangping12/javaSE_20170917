package cn.edu.tsinghua.javase.oop;

public class Calculator {

    public Calculator(int x, int y) {
        this.x = x;
        if (y == 0) {
            System.out.println("y can not be zero.");
            System.exit(0);
       } else {
            this.y = y;
        }
    }

    private int x;
    private int y;

    private boolean b;//对于boolean类型的生成的set和get方法分别为setB和isB

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int divide() {
       // m();
        return x / y;
    }

}
