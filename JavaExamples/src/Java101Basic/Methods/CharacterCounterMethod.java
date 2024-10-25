package Java101Basic.Methods;

import java.util.Scanner;

public class CharacterCounterMethod {

    // Method to count the occurrences of a character in a string
    static void countCharacters(String sentence, char character) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("The given sentence or word contains " + count + " occurrences of '" + character + "'.");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a sentence or word
        System.out.print("Enter a sentence or word: ");
        String input = scan.nextLine();

        // Prompt the user to enter a character to count its occurrences
        System.out.print("Enter a character: ");
        char character = scan.next().charAt(0);

        // Call the countCharacters method to count the occurrences of the character
        countCharacters(input, character);
    }
}
