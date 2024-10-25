package Java101Basic.MathExamples;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scan.nextInt();

        int largest = number1;

        if(number2 > largest) {
            largest = number2;
        }
        if(number3 > largest) {
            largest = number3;
        }

        System.out.println("The largest of the entered numbers is = " + largest);
    }
}