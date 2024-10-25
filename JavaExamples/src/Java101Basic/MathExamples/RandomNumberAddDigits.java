package Java101Basic.MathExamples;
import java.util.Random;
public class RandomNumberAddDigits {
        public static void main(String[] args) {

            Random random = new Random();

            int number, sum;

            for(int i = 0; i < 5; i++)
            {
                sum = 0;
                number = 100 + random.nextInt(100); // Generates a random number between 100 and 199
                System.out.print(number);
                while(number > 0) {
                    sum += number % 10; // Adds the last digit to the sum
                    number = number / 10; // Removes the last digit
                }
                System.out.println(" Sum of digits = " + sum);
            }
        }
    }
