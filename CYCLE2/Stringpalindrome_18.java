import java.util.Scanner;

public class Stringpalindrome_18 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the string:");
        String str =scanner.nextLine().toLowerCase();

        String reveString="";
        String oString=str;


        for (int i=oString.length()-1;i>=0;i--){
            reveString+= oString.charAt(i);

        }
        if(oString==reveString){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        scanner.close();

        
    }
    
}
