package BASICS;

import java.util.Scanner;

public class basics8 {
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter a number:");
        int num = scanner.nextInt();

        int a=0, b=1;
        while (a<= num){
            System.out.println(a+" ");
            int c=a;
            a=b;
            b= c+b;

        }
        scanner.close();

    }
    
}
