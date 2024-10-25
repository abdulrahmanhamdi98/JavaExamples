package Java101Basic.MathExamples;
import java.util.Scanner;

public class Multiple_of_Number {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scan.nextInt();
            System.out.print("Enter a Multiple of Number: ");
            int multi = scan.nextInt();


            if(number % multi == 0) {
                System.out.println("The entered number is a multiple of " + multi + ".");
            }
            else {
                System.out.println("The entered number is not a multiple of " + multi + ".");
            }
        }
    }