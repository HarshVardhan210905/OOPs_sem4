
// public class task2 {
//     public static void main(String[] args) {
//         Employee t1=new Employee();
//         t1.start();
//         System.out.println(Thread.activeCount());
// }
// }

// class Employee extends Thread{
//     @Override
//     public void run(){
//         System.out.println("hello");
//     }
// }

public class task2 {
    public static void main(String[] args) {
        Employee t1 = new Employee();
        t1.start();
        System.out.println(Thread.activeCount());
    }
}

class Employee extends Thread {         // we are trying to inherit the thread class into employee
    @Override   // we are trying to override run method of thread class
    public void run() {
        System.out.println("Hello");
    }
}
