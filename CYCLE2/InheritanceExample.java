import java.util.Scanner;

// Class Person
class Person {
    protected String name;
    protected String gender;
    protected String address;
    protected int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Class Employee extends Person
class Employee extends Person {
    protected int empId;
    protected String companyName;
    protected String qualification;
    protected double salary;

    public Employee(String name, String gender, String address, int age,
                    int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Class Teacher extends Employee
class Teacher extends Employee {
    private String subject;
    private String department;
    private int teacherId;

    public Teacher(String name, String gender, String address, int age,
                   int empId, String companyName, String qualification, double salary,
                   String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void display() {
        System.out.println("-------------------------------------------------");
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("-------------------------------------------------");
    }
}

public class InheritanceExample {

    // Method to read an integer with input validation
    public static int readInt(Scanner sc, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                sc.nextLine();  // consume the newline
                return value;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine();  // consume the invalid input
            }
        }
    }

    // Method to read a double with input validation
    public static double readDouble(Scanner sc, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
                sc.nextLine();  // consume the newline
                return value;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();  // consume the invalid input
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = readInt(sc, "");

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            int age = readInt(sc, "Age: ");

            int empId = readInt(sc, "Employee ID: ");

            System.out.print("Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            double salary = readDouble(sc, "Salary: ");

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            int teacherId = readInt(sc, "Teacher ID: ");

            teachers[i] = new Teacher(name, gender, address, age, empId,
                    companyName, qualification, salary,
                    subject, department, teacherId);
        }

        System.out.println("\n========== Teacher Details ==========");
        for (Teacher t : teachers) {
            t.display();
        }

        sc.close();
    }
}
