package Java101Basic.Methods;

import java.util.Scanner;

public class PrimeNumbersInRangeMethod {

    // Method to find prime numbers between two given numbers
    static void primeNumbersInRange(int number1, int number2) {
        int count;
        for(int i = number1; i < number2; i++) {
            count = 0;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            // If count is zero, the number is prime
            if(count == 0) {
                System.out.println("Prime number = " + i);
            }
        }
    }

    public static void main(String[] args) {
        // Find prime numbers between number 1  and number 2 using the primeNumbersInRange method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        if (num2 > num1){
            primeNumbersInRange(num1, num2);
        }else {
            System.out.println("The operation is wrong!!!");
        }

    }
}
