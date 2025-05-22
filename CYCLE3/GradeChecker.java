import java.util.Scanner;

// Custom exception
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeChecker {
    public static void checkGrade(char grade) throws InvalidGradeException {
        if (grade < 'A' || grade > 'F') {
            throw new InvalidGradeException("Invalid grade! Grade must be between A and F.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's grade (A-F): ");
        char grade = sc.next().toUpperCase().charAt(0);

        try {
            checkGrade(grade);
            System.out.println("Grade is valid.");
        } catch (InvalidGradeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
