package BASICS;

import java.util.Scanner;

public class Basics5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter percentage obtained:");
        int per = scanner.nextInt();

        if (per>=90){
            System.out.println("A-Excellent work!");

        } else if (per>=80){
            System.out.println("B-Good Job!");

        }else if (per>=70){
            System.out.println("c-You can do better");
        }else if (per>=60){
            System.out.println("D-Work hard");
        }else{
            System.out.println("E-Failed.Try again");
        }

        scanner.close();



    }
    
}
