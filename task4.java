// class mytask1 extends Thread{
//     public void run(){
//         for(int i=0;i<=5;i++){
//             System.out.println("thread is running"+i);
//         }
//     }
    
// }
// public class task1{
//     public static void main(String[] args) {
//         mytask1 t1=new mytask1();
//         mytask1 t2=new mytask1();
//         t1.start();
//         t2.start();
//     }
// }
// 2nd Method to use Thread


class MyR implements Runnable{
    public void run() {
        for(int i=1; i<=3;i++)
        {
            System.out.println("Runnable thread "+ i);
            
        }
    }
}

public class task4 {
    public static void main(String[] args) {
        MyR r1 = new MyR();
        Thread t = new Thread(r1);
        t.start();
    }
}