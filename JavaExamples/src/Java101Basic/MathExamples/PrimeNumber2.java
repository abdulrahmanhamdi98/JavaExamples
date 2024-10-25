package Java101Basic.MathExamples;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter of number: ");
        int number = scan.nextInt();
        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }

        if (count == 0 && number > 1) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
