package Java101Basic.MathExamples;

import java.util.Scanner;

public class MultiplicationByAddition {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();

        for(int i = 0; i < number2; i++)
        {
            total += number1; // Add number1 to the total number2 times
        }
        System.out.println(number1 + " x " + number2 + " = " + total);
    }
}
