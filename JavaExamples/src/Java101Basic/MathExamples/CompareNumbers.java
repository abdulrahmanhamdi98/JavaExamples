package Java101Basic.MathExamples;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();

        if(number1 > number2) {
            System.out.println("Number 1 is greater than Number 2.");
        }
        else if(number1 < number2) {
            System.out.println("Number 1 is less than Number 2.");
        }
        else {
            System.out.println("The entered numbers are equal.");
        }
    }
}
