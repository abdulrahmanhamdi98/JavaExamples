package Java101Basic.MathExamples;
import java.util.Random;
public class RandomNumberOddEvenPrime {

        static boolean isPrime(int number) {
            int count = 0;
            for(int i = 2; i < number; i++)
            {
                if(number % i == 0) {
                    count++;
                }
            }
            return count == 0;
        }

        public static void main(String[] args) {

            Random random = new Random();
            int number;

            for(int i = 0; i < 20; i++)
            {
                number = 1 + random.nextInt(99); // Generates a random number between 1 and 99

                if(number % 2 == 0) {
                    System.out.println("Even number: " + number);
                }
                else if(isPrime(number)) {
                    System.out.println("Prime number: " + number);
                }
                else {
                    System.out.println("Odd number: " + number);
                }
            }
        }
    }


