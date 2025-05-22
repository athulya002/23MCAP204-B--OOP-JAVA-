public class Rectangle {
    double length;
    double width;

    // Default constructor
    public Rectangle() {
        length = 1;
        width = 1;
    }

    // Constructor with parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Creating instances of Rectangle
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 :");
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());
        System.out.println();

        Rectangle rect2 = new Rectangle(5, 3);
        System.out.println("Rectangle 2 :");
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
        System.out.println();

        Rectangle rect3 = new Rectangle(7, 4);
        System.out.println("Rectangle 3:");
        System.out.println("Area: " + rect3.calculateArea());
        System.out.println("Perimeter: " + rect3.calculatePerimeter());
    }
}
