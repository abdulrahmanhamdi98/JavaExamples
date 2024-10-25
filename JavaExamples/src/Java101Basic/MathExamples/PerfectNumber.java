package Java101Basic.MathExamples;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        for(int i = 1; i < number; i++)
        {
            if(number % i == 0) {
                sum += i; // Add proper divisors to the sum
            }
        }
        if(number == sum) {
            System.out.println(number + " is a perfect number.");
        }
        else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
