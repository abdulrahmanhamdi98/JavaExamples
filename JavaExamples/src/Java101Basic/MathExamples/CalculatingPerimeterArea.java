package Java101Basic.MathExamples;

import java.util.Scanner;

public class CalculatingPerimeterArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose any shape you want: ");
        System.out.println("\n------------ Options--------------\n");
        System.out.println("1- Triangle");
        System.out.println("2- Square");
        System.out.println("3- Rectangle");
        System.out.println("4- Circle");
        int edge1,edge2,height,base,shape,area,perimeter;
        System.out.println("Enter the number of the shape you want: ");
        shape = scan.nextInt();

        switch (shape){
            case 1:
                System.out.println("\n-------Triangle--------\n");
                System.out.println("Enter of height: ");
                height = scan.nextInt();
                System.out.println("Enter of base: ");
                base = scan.nextInt();
                System.out.println("Enter of edge : ");
                edge1= scan.nextInt();
                area = (int)(0.5*height*base);
                perimeter=(height+base+edge1);
                System.out.println("The area of the triangle is: "+area);
                System.out.println("The perimeter of the triangle is: "+perimeter);
                break;
            case 2:
                System.out.println("\n-------Square--------\n");
                System.out.println("Enter of edge 1 : ");
                edge1 = scan.nextInt();
                System.out.println("Enter of edge 2 : ");
                edge2= scan.nextInt();
                int edge;
                edge = edge1;
                edge1=edge2;
                edge2=edge;
                area = edge*edge;
                perimeter=4*edge;
                System.out.println("The area of the square is: "+area);
                System.out.println("The perimeter of the square is: "+perimeter);
                break;
            case 3:
                System.out.println("\n-------Rectangle--------\n");
                System.out.println("Enter of edge 1 : ");
                edge1 = scan.nextInt();
                System.out.println("Enter of edge 2 : ");
                edge2= scan.nextInt();
                area = edge1*edge2;
                perimeter=2*(edge1+edge2);
                System.out.println("The area of the rectangle is: "+area);
                System.out.println("The perimeter of the rectangle is: "+perimeter);
                break;
            case 4:
                System.out.println("\n-------Circle--------\n");
                System.out.println("Enter of radius : ");
                int radius= scan.nextInt();
                area = (int)(radius*radius*Math.PI);
                perimeter=2*(int)(radius*Math.PI);
                System.out.println("The area of the circle is: "+area);
                System.out.println("The perimeter of the circle is: "+perimeter);
                break;
            default:
                System.out.println("The choice is wrong");


        }





    }
}
