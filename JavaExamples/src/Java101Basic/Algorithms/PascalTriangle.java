package Java101Basic.Algorithms;
import java.util.ArrayList;
import java.util.List;
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0)
            return triangle;
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);
            row.add(1);

            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1);

            triangle.add(row);
        }

        return triangle;


    }
    public static void main(String[] args) {
        PascalTriangle solution = new PascalTriangle();

        // Test case 1
        int numRows1 = 5;
        List<List<Integer>> triangle1 = solution.generate(numRows1);
        System.out.println("Pascal's Triangle for numRows = " + numRows1 + ":");
        printTriangle(triangle1);

        // Test case 2
        int numRows2 = 1;
        List<List<Integer>> triangle2 = solution.generate(numRows2);
        System.out.println("\nPascal's Triangle for numRows = " + numRows2 + ":");
        printTriangle(triangle2);
    }

    private static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
