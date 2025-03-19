package BASICS;

import java.util.Scanner;

public class Basics3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the maths mark:");
        int maths = scanner.nextInt();

        System.out.println("enter the physics mark:");
        int physics = scanner.nextInt();

        System.out.println("enter the chemistry mark:");
        int chemistry = scanner.nextInt();

        int total = maths + physics + chemistry;
        int total2 = maths + physics;

        if ((maths>=60 && physics>=50 && chemistry>=40 && total>=200 || total2>=150)){
            System.out.println("Student eligible");
        }else{
            System.out.println("Student not eligible");

        }
        scanner.close();
        }

    
}
