import java.util.Arrays;
import java.util.Scanner;

public class Stringsort_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no: of strings:");
        int count= scanner.nextInt();
        scanner.nextLine();


        String[] array = new String[count];
        System.out.println("enter strings:");
        for(int i = 0; i<count; i++){
            array[i] = scanner.nextLine();
        }
        Arrays.sort(array);
        System.out.println("Sorted string is:"+Arrays.toString(array));
        scanner.close();


    }
    
}
