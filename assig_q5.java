// Extending Thread Class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

// Implementing Runnable Interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Interface: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

public class assig_q5 {
    public static void main(String[] args) {
        // Creating and starting thread using Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Creating and starting thread using Runnable interface
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}