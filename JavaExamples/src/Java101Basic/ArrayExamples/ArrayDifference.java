package Java101Basic.ArrayExamples;

import java.util.Scanner;

public class ArrayDifference {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int largest = 0, smallest = 0;

        int[] array = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            array[i] = scan.nextInt();
            if(i == 0) {
                largest = array[i];
                smallest = array[i];
            }
            if(array[i] > largest) {
                largest = array[i];
            }
            if(array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The largest element in the array = " + largest);
        System.out.println("The smallest element in the array = " + smallest);
        System.out.println("Difference = " + (largest - smallest));
    }
}
