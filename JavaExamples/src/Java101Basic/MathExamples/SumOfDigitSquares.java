package Java101Basic.MathExamples;

import java.util.Scanner;

public class SumOfDigitSquares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0, digit;

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        while(number > 0) {
            digit = number % 10; // Extract the last digit
            System.out.println("Square of " + digit + " = " + (digit * digit));
            sum += (digit * digit); // Add the square of the digit to the sum
            number /= 10; // Remove the last digit from the number
        }
        System.out.println("The sum of the squares of the digits of the entered number is = " + sum);
    }
}
