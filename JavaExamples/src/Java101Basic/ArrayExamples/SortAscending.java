package Java101Basic.ArrayExamples;

import java.util.Scanner;

public class SortAscending {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int temp;
        int [] array = new int[10];

        // Input array elements
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter element " + (i+1) + " of the array: ");
            array[i] = scan.nextInt();
        }

        // Sorting the array in ascending order
        for(int i = 0; i < 9; i++)
        {
            for(int j = i+1; j < 10; j++)
            {
                if(array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Output sorted array
        System.out.println("Sorted array in ascending order:\n");
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Element " + (i+1) + " of the array: " + array[i]);
        }
    }
}
