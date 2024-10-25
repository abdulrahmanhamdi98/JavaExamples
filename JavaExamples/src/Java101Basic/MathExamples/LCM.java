package Java101Basic.MathExamples;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        int max;
        int lcm = 0;
        max = num1 *num2;
        for (int i = max; i > num1 && i > num2 ; i--) {
            if (i%num1 == 0 && i % num2 == 0)
                lcm = i;

        }
        System.out.println("The LCM is : "+ lcm);
    }
}
