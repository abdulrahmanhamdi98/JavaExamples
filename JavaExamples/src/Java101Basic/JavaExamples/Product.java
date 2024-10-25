package Java101Basic.JavaExamples;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of the product without VAT: ");
        int price = scan.nextInt();

        double new_price = price + (price * 0.18);

        System.out.println("Price with VAT = " + new_price);
    }
}
