import java.util.Scanner;

// Custom exception class
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

public class PhoneNumber {
    // Method to validate phone number
    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Invalid phone number! It must contain exactly 10 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        try {
            validatePhoneNumber(phone);
            System.out.println("Phone number is valid.");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
