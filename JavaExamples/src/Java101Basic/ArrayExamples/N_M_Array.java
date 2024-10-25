package Java101Basic.ArrayExamples;

import java.util.Scanner;

public class N_M_Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows for the array: ");
        int rows = scan.nextInt();
        System.out.print("Enter the number of columns for the array: ");
        int columns = scan.nextInt();
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter a number: ");
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Entered array:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
