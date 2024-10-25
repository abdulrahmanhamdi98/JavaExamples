package Java102OOP.Calculator;

public class Operation extends Calculator {

    public Operation(int a, int b){
        super(a, b);
    }
    public int Sum(){
        return this.getX() + this.getY();
    }
    public int Sub(){
        return this.getX()-this.getY();
    }
    public int Mul(){
        return this.getX() * this.getY();
    }
    public int Div(){
        int z = this.getY();
        if (z == 0)
            return 0;
        return this.getX()/z;
    }


}
