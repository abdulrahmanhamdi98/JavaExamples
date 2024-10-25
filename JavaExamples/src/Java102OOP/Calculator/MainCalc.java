package Java102OOP.Calculator;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        Operation operation = new Operation(num1,num2);
        int result1 = operation.Sum();
        int result2 = operation.Sub();
        int result3 = operation.Mul();
        int result4 = operation.Div();

        System.out.println("The sum operation is: "+ result1);
        System.out.println("The sub operation is: "+ result2);
        System.out.println("The mul operation is: "+ result3);
        System.out.println("The div operation is: "+ result4);




    }
}
