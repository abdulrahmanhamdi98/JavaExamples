package Java101Basic.ArrayExamples;

import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a size of array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            array[i] = scan.nextInt();
            sum += array[i];
        }
        System.out.println("The average of the array is " + (sum / array.length));
    }
}
