package Java101Basic.MathExamples;

public class MultiplicationTable {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.println(i + "x" + j + "= " + (i * j)); // Prints the product of i and j
            }
            System.out.println("\n"); // Prints a newline after each row
        }
    }
}
