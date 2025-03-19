package BASICS;

import java.util.Scanner;

public class Basics4 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your job (1.manager/2.developer/3.intern):");
        int role = scanner.nextInt();

        System.out.println("Enter year of experience:");
        int exp = scanner.nextInt();

        int salary = 0;

        switch (role) {

            case 1:
                salary=50000;
                break;
            case 2:
                salary=30000;
                break;
            case 3:
                salary=15000;
                break;
            default:
                System.out.println("invalid");
                scanner.close();
                return;
        }
        double bonus = 0;
        if (exp >= 5) {
            bonus = 0.2 * salary; 
        }else{
            bonus = 0.1 * salary;  
        }
        
        double total= salary+bonus;
        System.out.println("salary:"+salary);
        System.out.println("bonus:"+bonus);
        System.out.println("Total salary:"+total);

        scanner.close();

 
    }
}
