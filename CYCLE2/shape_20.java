interface Shape {
    double calculateArea();
}

// Triangle class implementing Shape
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor to initialize dimensions
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding calculateArea method
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding calculateArea method
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to demonstrate polymorphism
public class shape_20 {
    public static void main(String[] args) {
        // Shape references pointing to different objects
        Shape s1 = new Triangle(10, 5);
        Shape s2 = new Rectangle(4, 6);

        // Polymorphic calls
        System.out.println("Area of Triangle: " + s1.calculateArea());
        System.out.println("Area of Rectangle: " + s2.calculateArea());
    }
}

    

