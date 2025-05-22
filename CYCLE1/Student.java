

import java.util.Scanner;

public class Student {
    int studentId;
    String name;
    double marks;
    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public boolean isPassed() {
        return marks >= 40;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks1 = scanner.nextDouble();

        Student student1 = new Student(studentId1, name1, marks1);

        System.out.print("Enter Student ID: ");
        int studentId2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks2 = scanner.nextDouble();

        Student student2 = new Student(studentId2, name2, marks2);

       


        System.out.println("\nStudent 1 Details:");
        student1.displayDetails();
        System.out.println("Passed: " + student1.isPassed());

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
        System.out.println("Passed: " + student2.isPassed());

   

        scanner.close();
    }
}