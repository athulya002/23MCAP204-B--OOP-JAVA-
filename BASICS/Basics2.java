package BASICS;

import java.util.Scanner;

public class Basics2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length= scanner.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth = scanner.nextDouble();

        double area= length*breadth;
        System.out.println("Area of the rectangle: " + area);
        double perimeter= 2*(length+breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();


    }
    
}
