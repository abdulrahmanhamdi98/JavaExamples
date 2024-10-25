package Java101Basic.JavaExamples;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your midterm score: ");
        int midterm = scan.nextInt();
        System.out.print("Enter your final exam score: ");
        int finalExam = scan.nextInt();

        double grade = (midterm * 0.4) + (finalExam * 0.6);

        System.out.println("Your final grade = " + grade);

        if(100>=grade && grade >= 90) {
            System.out.println("You passed the course with an AA grade.");
        }
        else if(89 >=grade && grade >= 85) {
            System.out.println("You passed the course with a BA grade.");
        }
        else if(84 >=grade && grade >=  80) {
            System.out.println("You passed the course with a BB grade.");
        }
        else if(79 >=grade && grade >= 70) {
            System.out.println("You passed the course with a CB grade.");
        }
        else if(69 >=grade && grade >= 60) {
            System.out.println("You passed the course with a CC grade.");
        }
        else if(59 >=grade && grade >= 50) {
            System.out.println("You passed the course with a DC grade.");
        }
        else {
            System.out.println("You failed the course with a FF grade.");
        }
    }
}