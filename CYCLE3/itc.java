// Remove 'public' from here
class SharedData {
    int data;
    boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (Exception e) {}
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    public synchronized void consume() {
        while (!available) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

// Remove 'public' from here
class Producer extends Thread {
    SharedData d;
    Producer(SharedData d) {
        this.d = d;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            d.produce(i);
        }
    }
}

// Remove 'public' from here
class Consumer extends Thread {
    SharedData d;
    Consumer(SharedData d) {
        this.d = d;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            d.consume();
        }
    }
}

// Only this class is public because the file is named itc.java
public class itc {
    public static void main(String[] args) {
        SharedData d = new SharedData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
    }
}
