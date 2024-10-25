package Java101Basic.ArrayExamples;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int digitCount = 0, digit;
        int total = 0;

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int temp = number;
        int temp2 = number;

        while(temp > 0) {
            temp /= 10;
            digitCount++;
        }
        while(number > 0) {
            digit = number % 10;
            total += (int) Math.pow(digit, digitCount);
            number /= 10;
        }
        if(total == temp2) {
            System.out.println(temp2 + " is an Armstrong number.");
        }
        else {
            System.out.println(temp2 + " is not an Armstrong number.");
        }
    }
}
