package Java101Basic.JavaExamples;

import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number1, number2;
        int temp;

        System.out.print("Enter the first number: ");
        number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        number2 = scan.nextInt();

        System.out.println("Swapping values...");

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("First number = " + number1);
        System.out.println("Second number = " + number2);
    }
}
