package cn.edu.tsinghua.javase.oop;

public class Son extends Father {

    private int i;
    private boolean b;
    private double d;
    private String s;

    //子类 重写 overwrite / 覆盖 override 了父类的方法（有相同的声明，访问权限可扩大，但是不可以缩小）
    @Override
    void method() { // private - default - protected - public（从小到大的范围）
//        super.method();
        System.out.println("son class...");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}