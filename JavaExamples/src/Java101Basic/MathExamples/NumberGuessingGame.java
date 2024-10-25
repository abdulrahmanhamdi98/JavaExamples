package Java101Basic.MathExamples;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = 1 + random.nextInt(49); // Generates a random number between 1 and 49
        //System.out.println("Randomly generated number = " + randomNumber);
        System.out.println("The random number is between 1 and 50.");
        int guess, attempts = 0;

        do {
            System.out.print("Enter a number: ");
            guess = scan.nextInt();
            if(guess > randomNumber) {
                System.out.println("Reduce the number.");
            }
            else if(guess < randomNumber) {
                System.out.println("Increase the number.");
            }
            attempts++;
        }
        while(guess != randomNumber);

        System.out.println("Congratulations!! You found the number in " + attempts + " attempts.");
    }
}
