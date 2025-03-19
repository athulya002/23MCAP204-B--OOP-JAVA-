package BASICS;
import java.util.Scanner;
public class Basics1 {
    //area,perimeter
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the radius:");
        double radius = scanner.nextDouble();

        double area=Math.PI * radius *radius;
        double perimeter = 2*Math.PI *radius;

        System.out.println("Area:"+area );
        System.out.println("Perimetre:"+ perimeter);
        
        scanner.close();
    }
    
}