import java.util.Scanner;  // ✅ This must be at the very top

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class PasswordValidator {
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8)
            throw new InvalidPasswordException("Password must be at least 8 characters long.");

        if (!password.matches(".*\\d.*"))
            throw new InvalidPasswordException("Password must contain at least one digit.");

        if (!password.matches(".*[\\$#&].*"))
            throw new InvalidPasswordException("Password must contain at least one special character ($#&).");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String inputPassword = sc.nextLine();

        try {
            validatePassword(inputPassword);
            System.out.println("Password is valid!");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
