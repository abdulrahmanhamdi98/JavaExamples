package Java101Basic.MathExamples;
import java.util.Random;
public class RandomNumbersOdd {


    public static void main(String[] args) {

        Random random = new Random();

        int number, total = 0;
        int count = 0;

        for(int i = 0; i < 10; i++)
        {
            number = 1 + random.nextInt(99); // Generates a random number between 1 and 99
            if(number % 2 == 1) {
                System.out.println("Odd numbers: " + number);
                total += number;
                count++;
            }
            else {
                System.out.println("Even numbers: " + number);
            }
        }
        System.out.println("Average of odd numbers = " + (total / count));
    }
}
