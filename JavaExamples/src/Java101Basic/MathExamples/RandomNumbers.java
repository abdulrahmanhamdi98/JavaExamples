package Java101Basic.MathExamples;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random random = new Random();
        int number;


        for(int i = 0; i < 10; i++)
        {
            number = 200 + random.nextInt(800); // Generates a random number between 0 and 799, then adds 200
            System.out.println(number);
        }
    }
}
