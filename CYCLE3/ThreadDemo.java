// No public keyword here
class Fibonacci extends Thread {
    public void run() {
        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.println("Fibonacci Series:");
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}

// No public keyword here
class EvenNumbers extends Thread {
    public void run() {
        System.out.println("Even Numbers between 1 and 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// This is the main class, must match the file name: ThreadDemo.java
public class ThreadDemo {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        EvenNumbers even = new EvenNumbers();

        fib.start();
        even.start();
    }
}
