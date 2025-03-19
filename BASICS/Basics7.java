package BASICS;

import java.util.Scanner;

public class Basics7 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number:");
        int num= scanner.nextInt();

        int sum=0,a =num, digits=0;
        //count digits
        
        while(a>0){
            a=a/10;
            digits++;
        }

        //sum
        a=num;
        while(a>0){
            int digit =a%10;
            sum+= Math.pow(digit,digits);
            a=a/10;

        }

        if (sum==num){
            System.out.println("is a Armstrong number");
        }else{
            System.out.println("is not a Armstrong number");
        }
        scanner.close();


        
    }
    
}
