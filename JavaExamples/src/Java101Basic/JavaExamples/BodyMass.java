package Java101Basic.JavaExamples;

import java.util.Scanner;

public class BodyMass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your height (e.g., 1.75): ");
        float height = scan.nextFloat();
        System.out.print("Enter your weight: ");
        float weight = scan.nextFloat();

        float bmi = weight / (height * height);
        System.out.println("Your Body Mass Index (BMI) = " + bmi);

        if(bmi < 18) {
            System.out.println("Underweight");
        }
        else if(bmi < 25) {
            System.out.println("Normal");
        }
        else if(bmi < 30) {
            System.out.println("Overweight");
        }
        else if(bmi < 35) {
            System.out.println("Obese");
        }
        else {
            System.out.println("Morbidly Obese");
        }
    }
}

