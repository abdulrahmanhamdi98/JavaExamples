package Java101Basic.ArrayExamples;

import java.util.Scanner;

public class OddNumbersArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int[] array = new int[10];
        int[] oddArray = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            array[i] = scan.nextInt();
            if (array[i] % 2 == 1) {
                oddArray[count] = array[i];
                count++;
            }
        }
        System.out.println("Odd numbers:\n");
        for (int i = 0; i < count; i++) {
            System.out.println("Odd number = " + oddArray[i]);
        }
    }
}
