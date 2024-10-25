package Java101Basic.MathExamples;

import java.util.Scanner;

public class Average_of_N_Numbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number, total = 0;

        System.out.print("Enter the number of values you want to enter: ");
        int count = scan.nextInt();

        for(int i = 0; i < count; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            number = scan.nextInt();
            total += number;
        }
        System.out.println("The average of the numbers = " + ((float)total / count));
    }
}
