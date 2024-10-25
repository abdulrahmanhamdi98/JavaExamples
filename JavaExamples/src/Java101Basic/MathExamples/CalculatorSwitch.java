package Java101Basic.MathExamples;

import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();

        System.out.println("****SELECT YOUR OPERATION****");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");

        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("The result of addition = " + (number1 + number2));
                break;
            case 2:
                System.out.println("The result of subtraction = " + (number1 - number2));
                break;
            case 3:
                System.out.println("The result of multiplication = " + (number1 * number2));
                break;
            case 4:
                if(number2 != 0) {
                    System.out.println("The result of division = " + ((float)number1 / number2));
                }
                else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("You made an incorrect choice. Please check your selection.");
        }
    }
}

