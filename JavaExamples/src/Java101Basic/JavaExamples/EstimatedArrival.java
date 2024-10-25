package Java101Basic.JavaExamples;

import java.util.Scanner;

public class EstimatedArrival {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int distance, hours;

        System.out.print("Enter the distance of the journey (km): ");
        distance = scan.nextInt();
        System.out.print("Enter the desired travel time (hours): ");
        hours = scan.nextInt();

        System.out.println("The average speed you need to travel is = " + (distance / hours) + "km/h.");
    }
}
