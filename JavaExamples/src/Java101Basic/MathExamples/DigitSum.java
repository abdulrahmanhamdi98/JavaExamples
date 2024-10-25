package Java101Basic.MathExamples;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        while(number > 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10;  // Remove the last digit from the number
        }
        System.out.println("The sum of the digits of the entered number is = " + sum);
    }
}
