package Java101Basic.JavaExamples;

import java.util.Scanner;

public class LetterA {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter a sentence or word: ");
        String sentence = scan.nextLine();

        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println("There are " + count + " occurrences of the letter 'a' in the entered sentence or word.");
    }
}
