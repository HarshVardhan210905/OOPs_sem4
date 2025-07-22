/// Write a Java program to create a thread by extending the Thread class that prints numbers from 1 to 5 with a delay of 500 ms.


class Mythread1 extends Thread{
    public void run(){
        for(int i=0; i<=5;i++)
        {
            System.out.println("Thread 1 is runing: "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class assig_q1 {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
    }
}