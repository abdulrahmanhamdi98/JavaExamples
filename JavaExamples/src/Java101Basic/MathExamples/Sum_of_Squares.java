package Java101Basic.MathExamples;

import java.util.Scanner;

public class Sum_of_Squares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int square;

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++)
        {
            square = i * i;
            System.out.println("The square of " + i + " = " + square);
        }
    }
}
