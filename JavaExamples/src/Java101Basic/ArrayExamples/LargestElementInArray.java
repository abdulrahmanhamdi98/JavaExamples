package Java101Basic.ArrayExamples;

import java.util.Scanner;

public class LargestElementInArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        // Set the largest variable to the smallest possible integer value

        int[] array = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            array[i] = scan.nextInt();
            if(array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("The largest element in the array = " + largest);
    }
}
