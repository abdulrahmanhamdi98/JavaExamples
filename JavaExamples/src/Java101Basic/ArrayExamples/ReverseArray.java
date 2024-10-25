package Java101Basic.ArrayExamples;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            array[i] = scan.nextInt();
        }
        System.out.println("Reversed array:\n");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Element " + (array.length - i) + " of the array = " + array[i]);
        }
    }
}
