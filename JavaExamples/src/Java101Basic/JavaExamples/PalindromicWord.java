package Java101Basic.JavaExamples;

import java.util.Scanner;

public class PalindromicWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        String reversedWord = "";

        // Reverse the input word
        for(int i = (word.length()-1); i >= 0; i--)
        {
            reversedWord += word.charAt(i);
        }

        // Check if the reversed word is equal to the original word
        if(reversedWord.equals(word)) {
            System.out.println("The entered word is a palindrome.");
        }
        else {
            System.out.println("The entered word is not a palindrome.");
        }
    }
}
