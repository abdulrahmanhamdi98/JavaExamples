package Java101Basic.JavaExamples;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your balance: ");
        int balance = scan.nextInt();

        System.out.println("Your Balance = " + balance);
        System.out.println("\n****OPERATIONS****\n");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Return Card");

        System.out.print("\nSelect Your Operation: ");
        int operation = scan.nextInt();

        switch(operation) {
            case 1:
                System.out.println("Your Balance = " + balance);
                System.out.print("Enter the amount you want to withdraw: ");
                int amount = scan.nextInt();
                if(amount > balance) {
                    System.out.print("Insufficient balance. Please enter again: ");
                    amount = scan.nextInt();
                }
                balance -= amount;
                System.out.println("Your new balance = " + balance);
                break;
            case 2:
                System.out.println("Your Balance = " + balance);
                System.out.print("Enter the amount you want to deposit: ");
                amount = scan.nextInt();
                balance += amount;
                System.out.println("Your new balance = " + balance);
                break;
            case 3:
                System.out.println("Your Balance = " + balance);
                break;
            case 4:
                System.out.println("Don't forget to take your card!!");
                break;
            default:
                System.out.println("You have selected the wrong operation. Please try again.");
        }
    }
}
