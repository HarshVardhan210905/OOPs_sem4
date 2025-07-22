class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class assig_q2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        // Calling start() - runs in a new thread
        t1.start();

        // Calling run() directly - runs in the main thread
        t1.run();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}