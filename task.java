public class task {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1 =new Thread();
        System.out.println(Thread.activeCount());
        t1.start();
        System.out.println(Thread.activeCount());

        Thread t2 =new Thread();
        Thread t3 =new Thread();
        Thread t4 =new Thread();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(Thread.activeCount());
}
}