package Java102OOP.Calculator;

public class Calculator {
    private int x;
    private int y;

    public Calculator(int a, int b){
        this.x = a;
        this.y = b;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
