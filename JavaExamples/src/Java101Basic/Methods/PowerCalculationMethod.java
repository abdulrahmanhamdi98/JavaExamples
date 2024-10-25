package Java101Basic.Methods;

import java.util.Scanner;

public class PowerCalculationMethod {

    // Method to calculate the power of a number
    static int calculatePower(int base, int exponent) {
        // Calculate the power using Math.pow and cast it to int
        int result = (int) Math.pow(base, exponent);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the base number from the user
        System.out.print("Enter the base number: ");
        int baseNumber = scan.nextInt();

        // Get the exponent from the user
        System.out.print("Enter the exponent: ");
        int exponent = scan.nextInt();

        // Calculate the power using the calculatePower method
        int result = calculatePower(baseNumber, exponent);

        // Display the result
        System.out.println(baseNumber + "^" + exponent + " = " + result);
    }
}
