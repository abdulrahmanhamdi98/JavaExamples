package Java101Basic.Methods;

import java.util.Scanner;

public class FactorialMethod {

    // Method to calculate the factorial of a number
    static void factorial(int number) {
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(number + "! = " + result);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // Call the factorial method with the input number
        factorial(number);
    }
}
