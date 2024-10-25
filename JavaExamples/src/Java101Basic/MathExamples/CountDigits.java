package Java101Basic.MathExamples;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        while(number > 0) {
            number /= 10; // number = number / 10;
            count++;

        }
        System.out.println("The number of digits in the entered number is = " + count);
    }
}
