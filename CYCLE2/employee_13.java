
// Abstract class Employee
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to test the system
public class employee_13 {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Athluya", 01, 50000);
        Employee emp2 = new PartTimeEmployee("Radha", 02, 200, 20);

        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        emp2.displayInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}
