package Java101Basic.Methods;

public class OverloadingMethod {

    // Method to add two integers
    static void add(int a, int b) {
        System.out.println("Sum of 2 numbers = " + (a + b));
    }

    // Method to add three integers
    static void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers = " + (a + b + c));
    }

    // Method to add four integers
    static void add(int a, int b, int c, int d) {
        System.out.println("Sum of 4 numbers = " + (a + b + c + d));
    }

    public static void main(String[] args) {
        // Calling the add method with different numbers of arguments
        add(5, 7);        // Calls the add method with 2 arguments
        add(7, 3, 6);     // Calls the add method with 3 arguments
        add(2, 8, 12);    // Calls the add method with 3 arguments
    }
}
