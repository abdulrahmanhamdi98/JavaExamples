package Java101Basic.MathExamples;
import java.util.Random;

public class RandomNumbersEven {


        public static void main(String[] args) {

            Random random = new Random();

            int number, total = 0;

            for(int i = 0; i < 10; i++)
            {
                number = 5 + random.nextInt(145); // Generates a random number between 5 and 149
                if(number % 2 == 0) {
                    System.out.println("Even number: " + number);
                    total += number;
                }
                else {
                    System.out.println(number);
                }
            }
            System.out.println("Total sum of even numbers = " + total);
    }

}
