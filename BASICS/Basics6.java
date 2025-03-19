package BASICS;

import java.util.Scanner;

public class Basics6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter a number:");
        int num = scanner.nextInt();

        int reverse =0,original=num;

        while (num>0){
            int digit = num % 10;
            reverse = reverse *10 +digit;
            num=num/=10;

        }
        if (reverse== original){
            System.out.println("is palindrome");
        }else {
            System.out.println("not palindrome");
        }
        scanner.close();
    }
    
}
    

