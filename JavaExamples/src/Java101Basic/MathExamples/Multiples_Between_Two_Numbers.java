package Java101Basic.MathExamples;

import java.util.Scanner;

public class Multiples_Between_Two_Numbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();
        System.out.print("Enter a Multiple of Number: ");
        int multi = scan.nextInt();

        for(int i = number1; i < number2; i++)
        {
            if(i % multi == 0) {
                System.out.println(i + " is a multiple of " + multi + ".");
            }
        }
    }
}
