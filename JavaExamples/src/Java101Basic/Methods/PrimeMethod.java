package Java101Basic.Methods;

import java.util.Scanner;

public class PrimeMethod {

    // Method to check if a number is prime
    static boolean isPrime(int number) {
        int count = 0;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                count++;
            }
        }
        // If count is zero, the number is prime
        if(count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // Check if the number is prime using the isPrime method
        if(isPrime(number)) {
            System.out.println("The entered number is a prime number.");
        } else {
            System.out.println("The entered number is not a prime number.");
        }
    }
}
