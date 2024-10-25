package Java101Basic.JavaExamples;

import java.util.Scanner;

public class AbLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter a sentence or word: ");
        String sentence = scan.nextLine();

        // We don't need to check the last character.

        for(int i = 0; i < sentence.length()-1; i++)
        {
            if((sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A') &&
                    (sentence.charAt(i+1) == 'b' || sentence.charAt(i+1) == 'B')) {
                count++;
            }
        }
        System.out.println("There are " + count + " occurrences of the 'ab' letter group in the entered sentence or word.");
    }
}
