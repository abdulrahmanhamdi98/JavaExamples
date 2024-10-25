package Java101Basic.MathExamples;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.print("The reverse of the entered number = ");
        while(number > 0) {
            System.out.print(number % 10); // Print the last digit
            number /= 10; // Remove the last digit
        }
    }
}
